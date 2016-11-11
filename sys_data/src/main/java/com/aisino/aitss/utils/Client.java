package com.aisino.aitss.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;

import com.aisino.data.Message;
import com.aisino.data.Response;
import com.google.gson.JsonIOException;

public class Client {

	private static PoolingHttpClientConnectionManager cm;
	private CloseableHttpClient httpClient;
	private HttpClientContext context;
	private String prefix;
	public boolean ishttps;
	
	public Client(String prefix) {
		try {
			ishttps = "https".equals(new URL(prefix).getProtocol());
			Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create().register("http", PlainConnectionSocketFactory.INSTANCE).build();
			if (cm == null) {
				cm = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
		        cm.setMaxTotal(200);
		        cm.setDefaultMaxPerRoute(5);
		        cm.setDefaultSocketConfig(SocketConfig.custom().setTcpNoDelay(true).build());
		        cm.closeExpiredConnections();
				cm.closeIdleConnections(60, TimeUnit.SECONDS);
			}
			CookieStore cookieStore = new BasicCookieStore();
			context = HttpClientContext.create();
		    context.setCookieStore(cookieStore);
			RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(10000)
					.setConnectTimeout(10000).setSocketTimeout(30000).build();
			this.prefix = prefix;
			httpClient = HttpClients.custom().setConnectionManager(cm).setDefaultRequestConfig(requestConfig)
					.setKeepAliveStrategy(new DefaultConnectionKeepAliveStrategy()).build();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public Response Post(String urlEnd, String param) {
		Response r = new Response();
		HttpPost httpPost = new HttpPost(prefix + urlEnd);
		try {
			httpPost.setHeader("Connection", "keep-alive");
            if (param != null) {
            	httpPost.setEntity(new StringEntity(param, ContentType.APPLICATION_JSON));
            }
            HttpResponse httpResponse = null;
            while (httpResponse == null) {
            	try {
            		httpResponse = httpClient.execute(httpPost, context);
            	} catch (InterruptedIOException ex) {
            		if (!ex.getMessage().equals("Connection has been shut down")) {
            			throw ex;
            		}
            	}
            }
            int code = httpResponse.getStatusLine().getStatusCode();
            switch (code)
            {
            case 200:
            	{
            		HttpEntity entity = httpResponse.getEntity();
            		byte[] bs = EntityUtils.toByteArray(entity);
            		String jsonStr;
            		if (bs[0] != '{') {
            			if (bs[0] == 0x1F && bs[1] == 0x8B && bs[2] == 0x08) {
            				GZIPInputStream gzin = new GZIPInputStream(new ByteArrayInputStream(bs));
                			InputStreamReader isr = new InputStreamReader(gzin, "utf-8");
                            BufferedReader br = new BufferedReader(isr);
                            StringBuilder sb = new StringBuilder();
                            String tempbf;
                            while ((tempbf = br.readLine()) != null) {
                                sb.append(tempbf);
                                sb.append("\r\n");
                            }
                            isr.close();
                            gzin.close();
                            jsonStr = sb.toString();
            			} else {
            				jsonStr = new String(bs);
            				System.out.println(jsonStr);
            				jsonStr = "{\"data\":\"" + jsonStr + "\"}";
            			}
            		} else {
            			jsonStr = new String(bs, "utf-8");
            		}
            		try {
            			r = GsonUtil.GsonToBean(jsonStr, Response.class);
            		} catch(JsonIOException ex) {
            			r.setCodeMes(Message.EXCEPTION_JSON);
            			return r;
            		}
    				return r;
            	}
            default:
            	r.setStatus(Message.HTTP_CODE_ERR);
				r.setMessage("http code is "+code);
				return r;
            }
		} catch (Exception ex) {
			r.setCodeMes(Message.HTTP_INPUTCREATE_EXCEPTION);
			return r;
        } finally {
        	httpPost.releaseConnection();
        }
	}
}

