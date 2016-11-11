package com.aisino.condition.cert;

import com.aisino.condition.BaseCondition;

public class CertUpload extends BaseCondition{
 private String cert;
 private Integer flag;
 private Integer ctype;
 public CertUpload(){
	 super();
 }
 public CertUpload(Integer proxyId,String cert,Integer flag,Integer ctype){
	 super(proxyId);
	 this.cert=cert;
	 this.flag=flag;
	 this.ctype=ctype;
 }
 public void setCert(String cert){
	 this.cert=cert;
 }
 public String getCert(){
	 return cert;	 
 }
 public void setFlag(Integer flag){
	 this.flag=flag;
 }
 public Integer getFlag(){
	 return flag;
 }
 public void setCtype(Integer ctype){
	 this.ctype=ctype;	 
 }
 public Integer getCtype(){
	 return ctype;
 }
}
