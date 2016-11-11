package com.aisino.condition.cert;

import com.aisino.condition.BaseCondition;

public class CertDownload extends BaseCondition {
private String certId;
public CertDownload(){
	super();
}
public CertDownload(Integer proxyId,String certId){
super(proxyId);	
this.certId=certId;	
}
public void setCertId(String certId){
	this.certId=certId;
}
public String getCertId(){
	return certId;
}
}
