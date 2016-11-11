package com.aisino.condition.cert;

import com.aisino.condition.BaseCondition;

public class CertCreateReqByKCon extends BaseCondition {


	private String subject;
	private String keyId;

	
	public CertCreateReqByKCon() {
		super();
	}
	
	public CertCreateReqByKCon(Integer proxyId, String subject, String keyId) {
		super(proxyId);
		this.subject = subject;
		this.keyId = keyId;
	}
	public CertCreateReqByKCon(Integer proxyId,String keyId){		
		super(proxyId);
		this.keyId = keyId;	
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getKeyId() {
		return keyId;
	}
	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}
	
}
