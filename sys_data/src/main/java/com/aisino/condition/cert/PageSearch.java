package com.aisino.condition.cert;

import java.sql.Timestamp;

import com.aisino.condition.BaseCondition;

public class PageSearch extends BaseCondition {
private Timestamp BeginTime;
private Timestamp EndTime;
private Integer page;
private Integer pageSize;
public PageSearch(Integer proxyId,Timestamp BeginTime,Timestamp EndTime){
	super(proxyId);
	this.BeginTime=BeginTime;
	this.EndTime=EndTime;
}
public PageSearch(Integer proxyId,Timestamp BeginTime,Timestamp EndTime,Integer page,Integer pageSize){
	super(proxyId);
	this.BeginTime=BeginTime;
	this.EndTime=EndTime;
	this.page=page;
	this.pageSize=pageSize;
}
public void setBeginTime(Timestamp BeginTime){
	this.BeginTime=BeginTime;
}
public Timestamp getBeginTime(){
	return BeginTime;
}
public void setEndTime(Timestamp EndTime){
	this.EndTime=EndTime;
}
public Timestamp getEndTime(){
	return EndTime;	
}
public Integer getPage(){
	return page;
}
public void setPage(Integer page){
	this.page=page;
}
public Integer getPageSize(){
	return pageSize;
}
public void setPageSize(Integer pageSize){
	this.pageSize=pageSize;
}
}
