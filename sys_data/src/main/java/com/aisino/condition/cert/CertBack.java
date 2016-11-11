package com.aisino.condition.cert;

import com.aisino.condition.BaseCondition;

public class CertBack extends BaseCondition {
private String keyPair;
private String cert;
public CertBack(){
	super();
}
public CertBack(String keyPair,String cert){
	this.cert=cert;
	this.keyPair=keyPair;
}
public void setKeyPair(String keyPair){
	this.keyPair=keyPair;
	
}
public String getKeyPair(){
	return keyPair;
}
public void setCert(String cert){
	this.cert=cert;
}
public String getCert(){
	return cert;	
}
}
