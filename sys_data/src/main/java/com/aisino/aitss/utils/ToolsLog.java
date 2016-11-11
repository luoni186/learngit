package com.aisino.aitss.utils;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ToolsLog {
	private static Logger log   ;
	static String logProject="系统日志";
	static{
		synchronized(ToolsLog.class){
			 Properties log4jproperties = PropertiesLoader.getProperties("conf/log4j.properties");
			 PropertyConfigurator.configure(log4jproperties);
			 log = Logger.getLogger(ToolsLog.class);
		}
	}
	private ToolsLog(){}
	public void setConfigurator(String url){
	
		PropertyConfigurator.configure(url);
	}
	public static void error(Object msg){
		Exception e = new Exception();
        StackTraceElement trace1 = e.getStackTrace()[1];
	    	 log.error(trace1+"\t"+ msg);
	}
	public static void debug(Object msg){
		Exception e = new Exception();
        StackTraceElement trace1 = e.getStackTrace()[1];
        	log.debug(trace1+"\t"+msg);
	}
	public static void info(Object msg){
		Exception e = new Exception();
        StackTraceElement trace1 = e.getStackTrace()[1];
        	log.info(trace1+"\t"+ msg);
	}
	public static void warn(Object msg){
		Exception e = new Exception();
        StackTraceElement trace1 = e.getStackTrace()[1];
        	log.warn(trace1+"\t"+ msg);
		
	}	
}
