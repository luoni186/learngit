package com.aitss.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.support.WebApplicationContextUtils;

//import com.aisino.aspect.SystemAspect;
import com.aisino.data.Message;
import com.aisino.data.Response;
import com.alibaba.druid.util.StringUtils;
import com.google.gson.JsonSyntaxException;

public class BaseController {
	
	Logger logger = LoggerFactory.getLogger(BaseController.class);

	
	//private final int BUFFER_SIZE = 8 * 1024; 
	
	private String parameter;

	public String getParameter() {
		return parameter;
	}
	
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	
	@ExceptionHandler({Exception.class})  
    public Response exception(Exception e) { 
		Response r = new Response();
		if (e instanceof  JsonSyntaxException) {
			r.setCodeMes(Message.EXCEPTION_JSON);//json数据异常
		} else if (e instanceof SQLException) {
			r.setCodeMes(Message.EXCEPTION_SQL);//SQL异常
		}else{
			r.setCodeMes(Message.EXCEPTION);//系统异常
			System.out.println(123);
		}		
		//r.setErrLogId(SystemAspect.logId);
		r.getDatas().put("detail", e.getMessage());
		return r;
    }

	/**
	 * 初始请求处理
	 * @param request
	 * @return
	 */
	protected Response init(HttpServletRequest request) {
		Response r = new Response();
		//String permission = (String)request.getParameter("permission");
		//System.out.println(permission);
		String parameter = null;
		try {
			ServletInputStream inputStream = request.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
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
			parameter = new String(buffer);
			//SystemAspect.param = parameter;
		} catch (IOException e) {
			r.setCodeMes(Message.PARAM_GET_ERR);
			return r;
		}
		
		//if (parameter == null || parameter.equals("")) {
		if (StringUtils.isEmpty(parameter)) {
			r.setCodeMes(Message.PARAM_NULL);
		} else {
			logger.debug("输入参数：" + parameter);
			setParameter(parameter);
		}
		
		return r;
	}
}
