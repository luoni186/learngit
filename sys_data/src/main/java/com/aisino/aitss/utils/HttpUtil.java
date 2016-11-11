package com.aisino.aitss.utils;

import java.io.BufferedReader;
import java.io.IOException;

import com.aisino.data.Message;
import com.aisino.data.Response;
import com.aisino.aitss.utils.*;
import com.github.kevinsawicki.http.HttpRequest;
import com.github.kevinsawicki.http.HttpRequest.HttpRequestException;

public class HttpUtil {
	
	private static final int HTTP_TIMEOUT = 60000;//毫秒
	
	public static String dataUrl;
	
	static {
		dataUrl = PropertiesUtil.getDataUrl();
	}
	
	/**
	 * 发送post请求
	 * @param urlEnd
	 * @param param
	 * @return
	 */
	public static Response post(String urlEnd, String param) {
		Response r = new Response();
		ToolsLog.info(dataUrl + urlEnd + ": " + param);
		System.out.println(dataUrl + urlEnd + ": " + param);
		try {
			HttpRequest request = HttpRequest
					.post(dataUrl + urlEnd)
					.acceptJson()
					.acceptCharset("UTF-8")
					.contentType("application/json", "UTF-8")
					.connectTimeout(HTTP_TIMEOUT)
					.send(param)
					;
			if (request.ok()) {
				BufferedReader in = request.bufferedReader();
				StringBuffer buffer = new StringBuffer();
				String line = "";
				try {
					while ((line = in.readLine()) != null){
						buffer.append(line);
					}
				} catch (IOException e) {
					r.setCodeMes(Message.HTTP_INPUTCREATE_EXCEPTION);
					return r;
				}
				r = GsonUtil.GsonToBean(new String(buffer), Response.class);
				request.disconnect();
				return r;
			} else {
				r.setStatus(Message.HTTP_CODE_ERR);
				r.setMessage("http code is "+request.code());
				request.disconnect();
			}
			//request.disconnect();
	    } catch (HttpRequestException exception) {
	    	r.setCodeMes(Message.HTTP_DATA_EXCEPTION);
	    }
		
		return r;
	}
	
	public static String test_post(String urlEnd, String param) {
		//Response r = new Response();
		try {
			HttpRequest request = HttpRequest
					.post("http://localhost:8000/electronic_seal/"+urlEnd)
					.acceptJson()
					.acceptCharset("UTF-8")
					.contentType("application/json", "UTF-8")
					.connectTimeout(HTTP_TIMEOUT)
					.send(param)
					;
			if (request.ok()) {
				int length = request.contentLength();
				System.out.println("length:"+length);
				BufferedReader in = request.bufferedReader();
				//String a = request.body();
				//System.out.println(a);
				//System.exit(0);
				StringBuffer buffer = new StringBuffer();
				String line = "";
				try {
					while ((line = in.readLine()) != null){
						buffer.append(line);
					}
				} catch (IOException e) {
					return Message.getMessage(Message.HTTP_INPUTCREATE_EXCEPTION);
				}
				request.disconnect();
				//System.out.println(buffer);
				return new String(buffer);
			} else {
				return Message.getMessage(Message.HTTP_CODE_ERR);
			}
			
	    } catch (HttpRequestException exception) {
	    	return Message.getMessage(Message.HTTP_DATA_EXCEPTION);
	    }
	}
}
