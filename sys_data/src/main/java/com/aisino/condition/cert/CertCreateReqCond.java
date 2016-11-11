package com.aisino.condition.cert;

import com.aisino.condition.BaseCondition;

public class CertCreateReqCond extends BaseCondition {
	private String algo;//算法
	private String subject;//主题
	private Integer bits;//密钥长度
	private Integer usage;//1，代表签名，2代表加密
	public CertCreateReqCond() {
		super();
	}
	
	public CertCreateReqCond(Integer proxyId,String algo, Integer bits, Integer usage) {
		super(proxyId);
		this.algo = algo;
		this.bits = bits;
		this.usage=usage;
	}
	
	public String getAlgo() {
		return algo;
	}
	public void setAlgo(String algo) {
		this.algo = algo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Integer getBits() {
		return bits;
	}
	public void setBits(Integer bits) {
		this.bits = bits;
	}
	public Integer getUsage(){
		return 1;//1代表参数usage签名，2代表加密
	}
	public void setUsage(Integer usage){
		this.usage=usage;
	}
}
