package com.aisino.data;

import java.util.HashMap;

public class Response  implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int status;
	
	private String message;
	
	private HashMap<String, Object> datas;
	
	private Integer errLogId;
	
	public Response(){
		status = Message.SUCCESS;
		message = "success";
		datas = new HashMap<String,Object>();
	}
	
	public Response(int i, String string) {
		datas = new HashMap<String,Object>();
		status = i;
		message = string;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
 
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public HashMap<String, Object> getDatas() {
		return datas;
	}

	public void setDatas(HashMap<String, Object> datas) {
		this.datas = datas;
	}
	
	public void setCodeMes(int status) {
		this.status = status;
		this.message = Message.getMessage(status);
	}
	
	public Integer getErrLogId() {
		return errLogId;
	}

	public void setErrLogId(Integer errLogId) {
		this.errLogId = errLogId;
	}
}
