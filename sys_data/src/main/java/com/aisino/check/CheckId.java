package com.aisino.check;

import com.aisino.data.Message;

public class CheckId {
	 public static  int checkProxyId(Integer proxyId){
	    	if (proxyId == null || proxyId <= 0){
	    		return Message.PROXY_ID_ERR;//不合法,返回4
	    	}else{
	    		return Message.SUCCESS;//合法,返回0
	    	}
	    }
	 public static int checkKeyId(String KeyId){
			if (KeyId == null || KeyId.isEmpty()){
	    		return Message.PROXY_ID_ERR;//不合法,返回4
	    	}else{
	    		return Message.SUCCESS;//合法,返回0
	    	}
	 }
	 public static int checkCertId(String CertId){		 
			if (CertId == null || CertId.isEmpty()){
	    		return Message.PROXY_ID_ERR;//不合法,返回4
	    	}else{
	    		return Message.SUCCESS;//合法,返回0
	    	} 
	 }
	 public static int checkFlag(String flag){
		  if(flag.equals("working")||flag.equals("shutdown")){
			  return Message.SUCCESS;
		  }	 else{
			  return Message.Flag_ERROR;
		  }		 
	 }
	 public static void main(String args[]){
		 int it;
		 it=checkFlag("working");
		 System.out.println(it);	 
	 }
}
