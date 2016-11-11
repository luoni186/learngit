package com.aisino.condition.cert;

import com.aisino.condition.BaseCondition;

public class CertCondition extends BaseCondition {
private String cert;
private String keySerial;//证书序列号
private Integer isAuth;
public CertCondition(){
	super();	
}
public CertCondition(Integer proxyId,String cert){
	super(proxyId);
	this.cert=cert;
}
public String getCert(){
	return cert;
}
public void setCert(String cert){
	this.cert=cert;	
}
public Integer getIsAuth() {
	return isAuth;
}

public void setIsAuth(Integer isAuth) {
	this.isAuth = isAuth;
}

public String getKeySerial() {
	return keySerial;
}

public void setKeySerial(String keySerial) {
	this.keySerial = keySerial;
}
}
