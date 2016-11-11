package com.aisino.aitss.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.Properties;

public class PropertiesUtil {
	private static String dataUrl = null;

	private static Properties properties = null;

	synchronized static public Properties getIntance() {
		if (properties == null) {
			loadProperty();
		}
		return properties;
	}

	synchronized static public void loadProperty() {
		InputStream is = PropertiesUtil.class.getClassLoader().getResourceAsStream("conf/config.properties");
		properties = new Properties();
		try {
			// properties.load(is);
			properties.load(new InputStreamReader(is, "UTF-8"));
			// dataUrl = properties.getProperty("dataurl").toString();
			is.close();
		} catch (Exception e) {
			System.err.println("不能读取属性文件. " + "请确保config.properties在CLASSPATH指定的路径中");
		}
	}

	synchronized static public void loads() {
		if (properties == null) {
			InputStream is = PropertiesUtil.class.getClassLoader().getResourceAsStream("conf/config.properties");
			Properties properties = new Properties();
			try {
				properties.load(is);
				dataUrl = properties.getProperty("dataurl").toString();
				is.close();
			} catch (Exception e) {
				System.err.println("不能读取属性文件. " + "请确保config.properties在CLASSPATH指定的路径中");
			}
		}
	}

	synchronized public static void updateProperty(String key, String value) {
		try {
			loadProperty();
			// FileOutputStream oFile = new
			// FileOutputStream("conf/config.properties");
			FileOutputStream oFile = new FileOutputStream(
					new File(PropertiesUtil.class.getClassLoader().getResource("conf/config.properties").toURI()));

			properties.setProperty(key, value);
			properties.store(oFile, "update");
			oFile.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String getDataUrl() {
		if (dataUrl == null) {
			try {
				loads();
				dataUrl = properties.getProperty("dataurl");
			} catch (Exception e) {

			}
		}
		return dataUrl;
	}

	public static String getModuleName(String key) {
		String moduleName = "";
		try {
			moduleName = getIntance().getProperty(key).toString();
		} catch (Exception e) {

		}
		return moduleName;
	}
}
