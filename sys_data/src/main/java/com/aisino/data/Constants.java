package com.aisino.data;

public class Constants {
	 // 算法OID
    public static final String SHA1_OID = "1.3.14.3.2.26";

    public static final String SM2_OID = "1.2.156.10197.1.301";
    public static final String SM3_OID = "1.2.156.10197.1.401";
    public static final String SHA256_OID="2.16.840.1.101.3.4.2.1";
    public static final String SHA1_WITH_RSA_SIGNATURE_OID = "1.3.14.3.2.29";
    public static final String SHA256_WITH_RSA_SIGNATURE_OID = "1.2.840.113549.1.1.11";
    public static final String SM3_WITH_SM2_SIGNATURE_OID = "1.2.156.10197.1.501";
    // 算法名称
    public static final String SHA1_NAME = "SHA1";
    public static final String MD5_NAME = "MD5";
    public static final String RSA_NAME = "RSA";
    public static final String SM2_NAME = "SM2";
    public static final String SM3_NAME = "SM3";
    public static final String SHA1_WITH_RSA_SIGNATURE_NAME = "SHA1WithRSA";
    public static final String SM3_WITH_SM2_SIGNATURE_NAME = "SM3WithSM2";

    // 数据长度
    public static final int SHA1_Byte_LENGTH = 160 / 8;
    public static final int MD5_BYTE_LENGTH = 128 / 8;
    public static final int SM3_BYTE_LENGTH = 256 / 8;

    // 密钥长度
    public static final int RSA_KEY_LENGTH = 2048;
    public static final int SM2_KEY_LENGTH = 256;

    // 日志标签
    public static final String LOG_PREFIX = "-------------------- ";
    public static final String LOG_SUFFIX = " --------------------";

    // JCE提供商
    public static final String FISHERMAN_JCE = "FishermanJCE";
    public static final String BC_JCE = "BC";

    // keystore类型
    public static final String FISHERMAN_KEYSTORE = "FMKS";

    // 时间戳序列号长度
    public static final int SERIAL_NUMBER_LENGTH = 36;

    // xml注释
    public static final String XML_COMMENT_PREFIX = "<!-- ";
    public static final String XML_COMMENT_SUFFIX = " -->";

    // 配置文件名称
    public static final String KEY_CONFIG_FILE = "keyConfig.xml";
    public static final String SYS_CONFIG_FILE = "sys_config.xml";

    // 行分隔符
    public static final String LINE_SEPERATOR = "aitss_line";

    // 文件分隔符
    public static final String FILE_SEPERATOR = "aitss_file";

    // 时间源设备类型
    public static final int TIME_STAMP_CARD = 0;
    public static final int TIME_STAMP_SERVER = 1;

    // MIME类型
    public static final String CONTENT_TYPE_APPLY_REQ = "application/timestamp-query";
    public static final String CONTENT_TYPE_APPLY_RESP = "application/timestamp-reply";
    public static final String CONTENT_TYPE_VERIFY_REQ = "application/timestamp-verify-req";
    public static final String CONTENT_TYPE_VERIFY_RESP = "application/timestamp-verify-resp";
    public static final String CONTENT_TYPE_QUERY_REQ = "application/timestamp-query-req";
    public static final String CONTENT_TYPE_QUERY_ARCHIVED_REQ = "application/timestamp-query-archived-req";
    public static final String CONTENT_TYPE_QUERY_RESP = "application/timestamp-query-resp";
}
