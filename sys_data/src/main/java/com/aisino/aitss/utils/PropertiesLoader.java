package com.aisino.aitss.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.apache.log4j.helpers.Loader;


public class PropertiesLoader {
	private PropertiesLoader() {  
    }  
    
    public static Properties getProperties(String propertyFileName)  
         {  
        try {  
        	URL url = Loader.getResource(propertyFileName);
            Properties props = new Properties();  
            props.load(url.openStream()); 
            return props;  
        } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new Properties();
    }  
  
    public static int getIntegerProperty(Properties p, String name,  
            int defaultValue) {  
        String l = p.getProperty(name);  
        return l == null ? defaultValue : Integer.valueOf(l).intValue();  
    }  
  
    public static String getStringProperty(Properties p, String name,  
            String defaultValue) {  
        String propertyValue = p.getProperty(name);  
        return propertyValue == null ? defaultValue : propertyValue;  
    }  
  
    public static boolean getBooleanProperty(Properties p, String name,  
            boolean defaultValue) {  
        String propertyValue = p.getProperty(name);  
        return propertyValue == null ? defaultValue : Boolean  
                .valueOf(propertyValue);  
    }  
    public static void main(String[] args ) throws IOException
    {
    	PropertiesLoader.getProperties("log4j.properties");
    }
}
