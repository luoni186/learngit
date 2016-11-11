package com.aisino.aitss.utils;
public class TestJson {
	public static void main(String args[]){
		//"{\"proxyId\":2,\"cert\":\"MIICczCC\"}"
		int proxyId=2;
		String cert="abc";
		String result=StringUtil.appendCert(proxyId, cert);
		 System.out.println(result);
	}
}
