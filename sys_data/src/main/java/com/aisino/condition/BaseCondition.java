package com.aisino.condition;

public class BaseCondition {

	private Integer proxyId;//代理点ID
	
	public BaseCondition() {
		
	}
	
	public BaseCondition(Integer proxyId) {
		this.proxyId = proxyId;
	}
	
	public Integer getProxyId() {
		return proxyId;
	}
	public void setProxyId(Integer proxyId) {
		this.proxyId = proxyId;
	}
}
