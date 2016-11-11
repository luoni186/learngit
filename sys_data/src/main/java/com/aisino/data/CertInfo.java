package com.aisino.data;

import java.sql.Timestamp;
import java.util.Date;

public class CertInfo {
    private String sn;

    private String algo;

    private String bits;

    private String subject;

    private String issuer;

    private Timestamp beginTime;

    private Timestamp endTime;
    public CertInfo(){
    	
    }
    public CertInfo(String certSn,String certAlgo,String certBits,String certSubject,String certIssuer,Timestamp begintime,Timestamp endtime ){
    this.sn=certSn;
    this.algo=certAlgo;
    this.bits=certBits;
    this.subject=certSubject;
    this.issuer=certIssuer;
    this.beginTime=begintime;
    this.endTime=endtime;	    	
    }
    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getAlgo() {
        return algo;
    }

    public void setAlgo(String algo) {
        this.algo = algo == null ? null : algo.trim();
    }

    public String getBits() {
        return bits;
    }

    public void setBits(String bits) {
        this.bits = bits == null ? null : bits.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String certIssuer) {
        this.issuer = issuer == null ? null : issuer.trim();
    }

    public Timestamp getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Timestamp beginTime) {
        this.beginTime = beginTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endtime) {
        this.endTime = endtime;
    }


}
