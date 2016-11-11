package com.aisino.aitss.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

public class XmlUtil {

	public static Document parseXmlFromString(String str) throws DocumentException {
		Document document = null;
		if (str != null) {
			document = DocumentHelper.parseText(str);
		}
		
		return document;
	}
	
	public static String xmlToString(Document document) {
		return document.asXML();
	}
}
