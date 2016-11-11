package com.aisino.check;

import com.aisino.condition.cert.CertCreateReqByKCon;
import com.aisino.condition.cert.CertCreateReqCond;
import com.aisino.data.Message;

public class CheckCert {
	//证书数据最大长度
	private static int CERT_MAX_LENGTH = 1024 * 30 * 4 / 3;
	//算法类型最大长度
	private static int ALGO_MAX_LENGTH = 16;
	//主题最大长度
	private static int SUBJECT_MAX_LENGTH = 255;
	//密钥ID最大长度
	private static int KEYID_MAX_LENGTH = 32;
	//证书序列号最大长度
	private static int SN_MAX_LENGTH = 32;
	//证书句柄最大长度
	private static int CERT_HANDLE_MAX_LENGTH = 32;
	//密钥数据最大长度
    private static int KEYPAIR_MAX_LENGTH=1024*10*4;
	/**
	 * 校验证书数据
	 * @param cert
	 * @return
	 */
	public static int checkCert(String cert) {
		if (cert == null || cert.trim().length() <= 0 || cert.trim().length() > CERT_MAX_LENGTH) {
			return Message.USERCERT_DATA_ERR;
		} else {
			return Message.SUCCESS;
		}
	}
	/**
	 * 校验创建服务器证书的条件
	 * @param condition
	 * @return
	 */
	public static int checkCreateReqConForSys(CertCreateReqCond condition) {
		String algo = condition.getAlgo();
		int ret = checkAlgo(algo);
		if (ret != Message.SUCCESS) {
			return ret;
		} else {
			condition.setAlgo(algo.trim());
		}
		String subject = condition.getSubject();
		ret = checkSubject(subject);
		if (ret != Message.SUCCESS) {
			return ret;
		} else {
			condition.setSubject(subject.trim());
		}
		Integer bits = condition.getBits();
		ret = checkKeyBits(bits);
		if (ret != Message.SUCCESS) {
			return ret;
		} 
		return Message.SUCCESS;
	}
	/**
	 * 校验密钥ID
	 * @param keyId
	 * @return
	 */
	public static int checkKeyId(String keyId) {
		if (keyId == null || keyId.trim().length() <= 0 || keyId.trim().length() > KEYID_MAX_LENGTH) {
			return Message.USERCERT_KEYID_ERR;
		} else {
			return Message.SUCCESS;
		}
	}
	
	/**
	 * 校验算法类型
	 * @param algo
	 * @return
	 */
	public static int checkAlgo(String algo) {
		if (algo == null || algo.trim().length() <= 0 || algo.trim().length() > ALGO_MAX_LENGTH) {
			return Message.USERCERT_KEYTYPE_ERR;
		} else {
			return Message.SUCCESS;
		}
	}
	
	/**
	 * 校验算法长度
	 * @param keyBits
	 * @return
	 */
	public static int checkKeyBits(Integer keyBits) {
		if (keyBits == null || keyBits <= 0) {
			return Message.USERCERT_KEYBITS_ERR;
		} else {
			return Message.SUCCESS;
		}
	}
	
	/**
	 * 校验主题
	 * @param subject
	 * @return
	 */
	public static int checkSubject(String subject) {
		if (subject == null || subject.trim().length() <= 0 || subject.trim().length() > SUBJECT_MAX_LENGTH) {
			return Message.USERCERT_SUBJECT_ERR;
		} else {
			return Message.SUCCESS;
		}
	}
	/*
	 * 校验密钥数据长度
	 * */
	public static int checkKeyPair(String keyPair){
		if(keyPair==null||keyPair.trim().length()<=0||keyPair.trim().length()>KEYPAIR_MAX_LENGTH){
			return Message.KEYPAIR_ERROR;
		}else{
			return Message.SUCCESS;
		}
	}
}
