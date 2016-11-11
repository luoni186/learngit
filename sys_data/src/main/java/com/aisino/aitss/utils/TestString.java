package com.aisino.aitss.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestString {
     public static void main(String args[]){
    	 String certParam="CN=aica, O=aisino, L=Beijing, ST=Beijing, C=CN";
    	// System.out.println(certParam.trim());
    	String cert= StringUtil.StringTrim(certParam);
    	System.out.println(cert);
    }	 
}
