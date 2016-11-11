package com.aisino.aitss.utils;

import java.sql.Timestamp;

public class Role {
	
    private Integer roleId;
    private Integer roleType;//角色类型,只能取1,2
    private Integer appId;//应用Id,系统Id
    private Integer permission;
    private String menu;
    private boolean enable_flag;
    private String descp;
    private Timestamp create_time;
    private Timestamp update_time;
	
	public Integer getPermission() {
		return permission;
	}
	public void setPermission(Integer permission) {
		this.permission = permission;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public boolean isEnable_flag() {
		return enable_flag;
	}
	public void setEnable_flag(boolean enable_flag) {
		this.enable_flag = enable_flag;
	}
	public String getDescp() {
		return descp;
	}
	public void setDescp(String descp) {
		this.descp = descp;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public Timestamp getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getRoleType() {
		return roleType;
	}
	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	    
}
