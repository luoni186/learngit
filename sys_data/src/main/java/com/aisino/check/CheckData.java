package com.aisino.check;

import java.sql.Timestamp;

import com.aisino.data.Message;

public class CheckData {
	 public static int checkData(String data){
			if (data == null || data.isEmpty()){
	    		return Message.USER_DATA_NULL;//不合法,返回4
	    	}else{
	    		return Message.SUCCESS;//合法,返回0
	    	}
	 }
	 public static int checkDataFlag(Integer dataFlag){
		 if(dataFlag!=0&&dataFlag!=1){
			 return Message.PARAM_ERR;
		 }else{
	    		return Message.SUCCESS;//合法,返回0
	    	}
	 }
	 public static int checkTsa(String tsa){
			if (tsa == null || tsa.isEmpty()){
	    		return Message.USER_DATA_NULL;//不合法,返回4
	    	}else{
	    		return Message.SUCCESS;//合法,返回0
	    	}
	 }
	 public static int chechTime(Timestamp time){
		if(time==null||time.toString().isEmpty()){
			return Message.TIME_Input_ERROR;
		} else{
			return Message.SUCCESS;
		}
	 }
}
