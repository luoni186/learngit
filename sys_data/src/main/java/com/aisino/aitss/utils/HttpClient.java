package com.aisino.aitss.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 发送Http post请求
 * @param strURL 请求服务地址
 * @param params 请求参数 json字符串,例如: "{ \"id\":\"12345\" }"
 * @author 1234
 *
 */
public class HttpClient {
	public static String post(String strURL, String params){
		
		System.out.println("**************"+strURL+"**************");
		System.out.println("**************"+params+"**************");
		try {
			URL url = new URL(strURL);// 创建连接
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setUseCaches(false);
			connection.setInstanceFollowRedirects(true);
			connection.setRequestMethod("POST"); // 设置请求方式
			connection.setRequestProperty("Accept", "application/json"); // 设置接收数据的格式
			connection.connect();
			// utf-8编码
			OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8"); 
			out.append(params);
			out.flush();
			out.close();
			// 读取响应
			//int length = 512;//(int) connection.getContentLength();// 获取长度
			InputStream is = connection.getInputStream();
			//if (length != -1) {
			StringBuffer sb = new StringBuffer();
			byte[] data = new byte[1024*4];
			String temp = "";
			int len = 0; 
			 while ((len = is.read(data)) != -1)  
	           {  
	               sb.append( new String(data, 0, len, "utf-8"));  
	           }  
				String result = new String(sb); // utf-8编码
				System.out.println(result);
				return result;
				} catch (IOException e) {
					e.printStackTrace();
				}
				return "error"; // 自定义错误信息
			}

	
}
 