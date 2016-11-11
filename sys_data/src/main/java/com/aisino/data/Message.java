package com.aisino.data;

/**
 * 错误码和错误信息
 * @author ntz
 *
 */
public class Message {

	//系统错误码 0~39
	public static final int SUCCESS = 0;//成功
	public static final int PARAM_GET_ERR = 1;//获取参数失败
	public static final int PARAM_NULL = 2;//参数为空
	public static final int PARAM_ERR = 3;//参数错误
	public static final int PROXY_ID_ERR = 4;//代理点ID为空或不合法
	public static final int ID_ERR = 5;//ID为空或不合法
	public static final int DATA_NULL = 6;//数据为空
	public static final int NOTHIING_DELETE = 7;//没有可删除的数据
	public static final int Flag_ERROR=8;
	public static final int NOT_WORKING=9;
	public static final int EXCEPTION_JSON_HTTP=10;
	public static final int CERT_KEYID_DIFF=11;
	public static final int RECOVER_SUCCESS=12;
	public static final int TIME_Input_ERROR=13;
	public static final int TSA_INSERT_ERROR=14;//时间戳数据库插入错误
	public static final int HTTP_DATA_EXCEPTION= 20;//调用数据模块的http请求异常
	public static final int HTTP_CODE_ERR = 21;//http返回码错误
	public static final int HTTP_INPUTCREATE_EXCEPTION = 22;//http读入输入流异常
	public static final int SQL_DELETE_ERR=23;//数据库删除错误
	public static final int SQL_UPDATE_ERR=24;
	
	public static final int EXCEPTION = 30;//系统异常
	public static final int EXCEPTION_JSON = 31;//json数据异常
	public static final int EXCEPTION_SQL = 32;//SQL异常
	public static final int EXCEPTION_INSERT_SQL=35;//SQL插入错误
	
	//新增权限模块
	public static final int EXCEPTION_JSONObject=33;//JSONObject异常,代理点为空
	public static final int EXCEPTION_INVOCATION=34;//反射方法里抛出了NullPointException
	
	//用户系错误码
	//用户错误码 40~69
	public static final int USER_ID_ERR = 40;//用户ID为空或不合法
	public static final int USER_INSERT_ERR = 41;//用户插入错误
	public static final int USER_DELETE_ERR = 42;//用户删除错误
	public static final int USER_DATA_NULL = 43;//用户数据为空
	public static final int USER_NAME_ERR = 44;//用户名不合法
	public static final int USER_UPDATE_ERR = 45;//用户更新错误
	public static final int USER_TYPE_ERR = 46;//用户类型不合法
	public static final int USER_IDTYPE_ERR = 47;//用户证件类型不合法
	public static final int USER_IDNUM_ERR = 48;//用户证件号不合法
	public static final int USER_PHONE_ERR = 49;//用户联系电话不合法
	public static final int USER_POSTCODE_ERR = 50;//用户邮政编码不合法
	public static final int USER_ADDRESS_ERR = 51;//用户地址不合法
	public static final int USER_CORPORATE_ERR = 52;//法人不合法
	public static final int USER_REGADDRESS_ERR = 53;//注册地址不合法
	public static final int USER_LINKMANNAME_ERR = 54;//联系人名称不合法
	public static final int USER_TRANSACTORNAME_ERR = 55;//办理人名称不合法
	public static final int USER_TRANSACTORPHONE_ERR = 56;//办理人联系电话不合法
	public static final int USER_TRANSACTORADDRESS_ERR = 57;//办理人地址不合法
	public static final int USER_IS_NOT_ADMIN= 58;//此用户不是管理员
	
	//新增公共模块错误码
	public static final int APPID_ERR=59;//appId为空或不合法
	
	//代理点
	public static final int PROXY_CREATE_ERR = 60;//创建代理点错误
	public static final int PROXY_UPDATE_ERR = 61;//代理点更新错误
	public static final int PROXY_NAME_ERR = 62;//代理点名称错误
	public static final int PROXY_MAN_ERR = 63;//代理点联系人错误
	public static final int PROXY_ADDRESS_ERR = 64;//代理点地址错误
	public static final int PROXY_PHONE_ERR = 65;//代理点电话不合法
	public static final int PROXY_NAME_NULL = 66; //传入参数不能为空
	public static final int PROXY_NAME_EXIST = 67; //代理点名称已存在
	public static final int PROXY_NAME_MODIFY_ERR = 68; //代理点名称不能修改
	
	
	//用户证书错误码 70~99
	public static final int USERCERT_NO_EXIST = 70;//用户证书不存在
	public static final int USERCERT_DATA_ERR = 71;//用户证书数据不合法
	public static final int USERKEY_INSERT_ERR = 72;//用户证书插入错误
	public static final int USERCERT_UPDATE_ERR = 73;//用户证书更新错误
	public static final int USERCERT_COUNT_ERR = 74;//用户证书数量错误
	public static final int USERCERT_EXISTED = 75;//用户证书已经存在
	public static final int USERCERT_KEYID_NO_EXIST = 76;//用户下不存在此密钥ID
	public static final int USERCERT_DELETE_ERR = 77;//用户证书删除错误
	public static final int USERCERT_KEYTYPE_ERR = 78;//密钥算法错误
	public static final int USERCERT_SUBJECT_ERR = 79;//证书主题错误
	public static final int USERCERT_KEYBITS_ERR = 80;//密钥算法长度不合法
	public static final int USERCERT_KEYID_ERR = 81;//密钥ID错误
	public static final int USERCERT_ID_ERR = 82;//用户证书ID错误
	public static final int USERCERT_CERTNUM_ERR = 83;//证书序列号不合法
	public static final int USERCERT_CERTHANDLE_ERR = 84;//证书句柄不合法
	public static final int USER_CERT_NOT_EXISTS = 85; //证书不存在
	public static final int USERCERT_SN_ERR = 86;
	public static final int USERCERT_ISSUER_ERR = 87;
	public static final int USERCERT_ISSUER_NULL = 88;
	public static final int USER_CERT_OUT_OF_DATE = 89;
	
	public static final int TRUST_NULL = 90;//信任链为空
	public static final int TRUST_ERR = 91;//信任链不合法
	
	
	//角色错误码 100~110
	public static final int ROLE_CREATE_ERROR = 100;//角色创建错误
	public static final int ROLE_NO_EXISTED = 101;//角色信息不存在
	public static final int ROLE_NULL = 102;//角色信息为空
	public static final int ROLETYPE_ERR = 103;//roleType为空
	public static final int ROLE_ID_ERR = 104;// roleId为空或不合法
	
	//用户角色关系错误码 100-110
	public static final int RELATION_ERR = 105;//授权错误
	public static final int RELATION_NULL = 106;//用户角色关系不存在
	public static final int RELATION_INSERT_ERR = 107;//用户角色添加错误
	
	// 日志错误码
	public static final int LOG_HAD_ONFILE = 109;
	public static final int LOG_CREATE_ERR = 102;// 日志创建错误
	public static final int ONFILE_ERR = 103;// 归档参数错误
	public static final int LOG_DATA_NULL = 104;// 日志数据为空
	public static final int LOG_ID_ERR = 105;// 日志ID为空或不合法
	public static final int LOG_ONFILE_ERR = 106;// 业务日志归档错误
	public static final int LOG_ROLLBACK_ERR=107;//日志归档回滚错误
	public static final int LOG_ROLLBACK_ALREADY = 108;//已进行过日志回滚操作
		
	public static final int ERRORLOG_CREATE_ERR = 110;// 错误日志创建错误
	public static final int ERRORLOG_DATA_NULL = 111;// 错误日志数据为空
	public static final int ERRORLOG_ID_ERR = 112;// 错误日志ID为空或不合法
	public static final int ERRORLOG_ONFILE_ERR = 113;// 错误日志归档错误
	public static final int ERRORLOG_ROLLBACK_ERR = 114;//错误日志归档回滚错误
	public static final int ERRORLOG_ROLLBACK_ALREADY = 115;//已进行过错误日志回滚操作
	public static final int ERRORLOG_NOT_EXIST = 116; //不存在可归档错误日志
	//印章错误码 150~179
	public static final int SEAL_UPDATE_ERR = 150;//印章更新错误
	public static final int SEAL_INSERT_ERR = 151;//印章插入错误
	public static final int SEAL_NAME_EXIST = 152;//印章注记名重复
	public static final int SEAL_NO_EXIST = 153;//印章不存在
	public static final int SEAL_STATUS_UNCHANGE = 154;//印章状态未改变（被操作的印章已经是要被改变成的状态）
	public static final int SEAL_REVOKED = 155;//该印章已经被注销
	public static final int SEAL_STATUS_ERR = 156;//印章状态值不合法
	public static final int SEAL_TYPE_ERR = 157;//印章类型不合法
	public static final int SEAL_NAME_ERR = 158;//印章注记名不合法
	public static final int SEAL_AUTHORITY_ERR = 159;//印章权限不合法
	public static final int SEAL_REMAIN_COUNT_ERR = 160;//印章剩余使用次数不合法
	public static final int SEAL_NO_BELONG_USER = 161;//印章不属于该用户
	public static final int SEAL_STATUS_NO_NORMAL = 162;//印章无效（已冻结或注销）
	public static final int SEAL_REMAIN_COUNT_LESS = 163;//印章可使用次数不足
	public static final int SEAL_NO_SUPPORT_DOCTYPE = 164;//印章暂不支持此文档类型
	public static final int SEAL_NO_AUTHORITY = 165;//印章没有权限处理此类型文档
	public static final int SEAL_OVER_DUE = 166;//印章过期
	public static final int SEAL_BEFORE_BEGINTIME = 167;//未到印章开始使用时间
	public static final int SEAL_HANDLE_ERR = 168;//印章句柄不合法
	public static final int SEAL_FREEZE_OR_REVOKED = 169;//该印章已经被冻结或注销
	public static final int SEAL_ESEAL_NULL = 170;//印章数据为空
	
	public static final int OFFLINE_AUTH_INSERT_ERR = 191;//离线授权插入错误
	
	//签章错误码 200~
	public static final int ESIGN_DATA_NULL = 201;//签章数据为空
	public static final int ESIGN_NO_EXIST = 202;//签章不存在
	public static final int ESIGN_UPDATE_ERR = 203;//签章更新错误
	public static final int ESIGN_COUNT_PARAM_ERR = 204;//签章次数参数错误
	public static final int ESIGN_PRINT_COUNT_LESS = 205;//签章可打印次数不足
	public static final int ESIGN_CHECK_INSERT_ERR = 206;//验证方式插入错误
	public static final int ESIGN_CHECK_UPDATE_ERR = 207;//验证方式更新错误
	public static final int ESIGN_INSERT_ERR = 208;//签章插入错误
	public static final int ESIGN_PRE_NO_EXIST = 209;//上一个签章不存在
	public static final int ESIGN_DOC_DATA_ERR = 210;//文档数据为空或过长
	public static final int ESIGN_DOC_TYPE_ERR = 211;//文档类型不合法
	public static final int ESIGN_PRE_ID_ERR = 212;//上一签章ID错误
	public static final int ESIGN_TBS_ERR = 213;//待签数据不合法
	public static final int ESIGN_SIGN_ERR = 214;//签名值不合法
	public static final int ESIGN_ESIGN_ERR = 215;//签章数据不合法
	public static final int ESIGN_ISHASH_NULL = 216;//是否是hash为空
	
	
	public static final int TIMESTAMP_INSERT_ERR = 220;//时间戳插入错误
	public static final int TIMESTAMP_UPDATE_ERR = 221;//时间戳更新错误
	public static final int TIMESTAMP_ISUSE_NULL = 222;//时间戳是否使用为空
	
	//公共模块-用户认证模块
	public static final int USER_AUTH_ERR = 230;
	public static final int USER_AUTH_REGISTER = 231;
	public static final int USER_AUTH_NULL = 232;
	public static final int USER_AUTH_INSERT_ERR = 233;
	public static final int PASSWORD_UPDATE_ERR = 234;
	public static final int USER_NAME_PWD_AUTH_EXISITS = 235;
	public static final int USER_ROLE_RELATION_NULL = 236;
	public static final int PASSWORD_NULL = 237;
	public static final int WRONG_PASSWORD = 238;
	public static final int SET_USER_CERT_AUTH_ERR = 239;
	public static final int AUTH_MODE_ERR = 240;
	public static final int USERCERT_SN_NULL = 241;
	public static final int USERCERT_MODIFY_ERR = 242;
	public static final int USERAUTH_SN_ISSUER_EXIST = 243;
	public static final int USERAUTH_KEYSERIAL_EXIST = 244;
	public static final int USERAUTH_IS_NULL = 245;
	public static final int USERAUTH_MODE_ERR = 246;
	public static final int INITIALIZE_ERR = 247;
	public static final int NOT_INITIALIZE = 248;
	public static final int INITIALIZE_VALUE_ERR = 249;
	public static final int USERCERT_KERSERIAL_NULL = 250;
	public static final int USER_NAME_EXIST = 251;
	public static final int USERCERT_KEYID_DIFF = 3315;//证书的密钥ID不一致
	public static final int KEYPAIR_ERROR=300;
	
	private static String[] message;
	
	static {
		message = new String[3999];

		//系统错误码
		message[SUCCESS] = "成功";
		message[PARAM_GET_ERR] = "获取参数失败";
		message[PARAM_NULL] = "参数为空";
		message[PARAM_ERR] = "参数错误";
		message[PROXY_ID_ERR] = "代理点ID为空或不合法";
		message[ID_ERR] = "ID为空或不合法";
		message[DATA_NULL] = "数据为空";
		message[NOTHIING_DELETE] = "没有可删除的数据";
		message[Flag_ERROR]="输入参数为非法例如uninitial或者为空";
        message[NOT_WORKING]="时间戳服务关闭";
		message[EXCEPTION_JSON_HTTP]="json数据异常";
		message[HTTP_DATA_EXCEPTION] = "调用数据模块的http请求异常";
		message[HTTP_CODE_ERR] = "http返回码错误";
		message[HTTP_INPUTCREATE_EXCEPTION] = "http读入输入流异常";
		message[CERT_KEYID_DIFF]="申请密钥对失败";
		message[EXCEPTION] = "系统异常";
		message[EXCEPTION_JSON] = "json数据异常";
		message[EXCEPTION_SQL] = "SQL异常";
		message[EXCEPTION_INVOCATION]="反射方法里抛出了NullPointException";
		message[EXCEPTION_INSERT_SQL]="数据库操作出错";
		message[RECOVER_SUCCESS]="恢复成功";
		message[TIME_Input_ERROR]="时间输入为空";
		message[TSA_INSERT_ERROR]="时间戳插入数据库错误";
		message[SQL_DELETE_ERR]="数据库删除数据错误或者所选时间段内没有记录";
		message[SQL_UPDATE_ERR]="数据库更新出错或者没有可更新数据";
		//新增权限模块
		message[EXCEPTION_JSONObject]="JSONObject异常,代理点为空";
		//用户错误码
		message[USER_ID_ERR] = "用户ID为空或不合法";
		message[USER_INSERT_ERR] = "用户插入错误";
		message[USER_DELETE_ERR] = "用户删除错误";
		message[USER_DATA_NULL] = "用户数据为空";
		message[USER_NAME_ERR] = "用户名不合法";
		message[USER_UPDATE_ERR] = "用户更新错误";
		message[USER_TYPE_ERR] = "用户类型不合法";
		message[USER_IDTYPE_ERR] = "用户证件类型不合法";
		message[USER_IDNUM_ERR] = "用户证件号不合法";
		message[USER_PHONE_ERR] = "用户联系电话不合法";
		message[USER_POSTCODE_ERR] = "用户邮政编码不合法";
		message[USER_ADDRESS_ERR] = "用户地址不合法";
		message[USER_CORPORATE_ERR] = "法人不合法";
		message[USER_REGADDRESS_ERR] = "注册地址不合法";
		message[USER_LINKMANNAME_ERR] = "联系人名称不合法";
		message[USER_TRANSACTORNAME_ERR] = "办理人名称不合法";
		message[USER_TRANSACTORPHONE_ERR] = "办理人联系电话不合法";
		message[USER_TRANSACTORADDRESS_ERR] = "办理人地址不合法";
		message[USER_IS_NOT_ADMIN] = "此用户不是管理员";
		//新增公共模块错误码
		message[APPID_ERR]="appId为空或不合法";
		message[ROLETYPE_ERR]="角色类型不能为空";
		
		
		/*
		 * 代理点错误码60 ~ 67
		 */
		message[PROXY_CREATE_ERR] = "创建代理点错误";
		message[PROXY_UPDATE_ERR] = "更新代理点错误";
		message[PROXY_NAME_ERR] = "代理点名称错误";
		message[PROXY_MAN_ERR] = "代理点联系人错误";
		message[PROXY_ADDRESS_ERR] = "代理点地址错误";
		message[PROXY_PHONE_ERR] = "代理点电话不合法";
		message[PROXY_NAME_NULL] = "代理点名称为空";
		message[PROXY_NAME_EXIST] = "代理点名称已存在";
		message[PROXY_NAME_MODIFY_ERR] = "代理点名称不能修改";
		
		//用户证书错误码 70~99
		message[USERCERT_NO_EXIST] = "用户证书不存在";
		message[USERCERT_DATA_ERR] = "用户证书数据不合法";
		message[USERKEY_INSERT_ERR] = "用户密钥更新数据库错误";
		message[USERCERT_UPDATE_ERR] = "证书更新错误";
		message[USERCERT_COUNT_ERR] = "用户证书数量错误";
		message[USERCERT_EXISTED] = "证书已经存在";
		message[USERCERT_KEYID_NO_EXIST] = "不存在密钥ID";
		message[USERCERT_DELETE_ERR] = "用户证书删除错误";
		message[USERCERT_KEYTYPE_ERR] = "密钥算法错误";
		message[USERCERT_SUBJECT_ERR] = "证书主题错误";
		message[USERCERT_KEYBITS_ERR] = "密钥算法长度不合法";
		message[USERCERT_KEYID_ERR] = "密钥ID错误";
		message[USERCERT_ID_ERR] = "用户证书ID错误";
		message[USERCERT_CERTNUM_ERR] = "证书序列号不合法";
		message[USERCERT_CERTHANDLE_ERR] = "证书句柄不合法";
		message[USERCERT_SN_ERR] = "用户证书序列号错误";
		message[USERCERT_ISSUER_ERR] = "用户证书颁发者错误";
		message[USERCERT_ISSUER_NULL] = "用户证书办法折为空";
		message[USER_CERT_OUT_OF_DATE] = "用户证书已过期";
		
		message[TRUST_NULL] = "信任链为空";
		message[TRUST_ERR] = "信任链不合法";
		
		//角色错误码 100~119
		message[ROLE_CREATE_ERROR] = "角色创建错误";
		message[ROLE_NO_EXISTED] = "角色信息不存在";
		message[ROLE_ID_ERR] = "roleId为空或不合法";
		message[ROLE_NULL] = "角色信息为空";
		
		//用户角色关系错误码 120~139
		message[RELATION_ERR] = "授权错误";
		message[RELATION_NULL] = "用户角色关系为空";
		message[RELATION_INSERT_ERR] = "用户角色添加错误";
		
		// 日志错误码
		message[LOG_CREATE_ERR] = "日志创建错误";
		message[ONFILE_ERR] = "归档参数错误";
		message[LOG_DATA_NULL] = "日志数据为空";
		message[LOG_ID_ERR] = "日志ID为空或不合法";
		message[LOG_ONFILE_ERR] = "业务日志归档错误";
		message[LOG_ROLLBACK_ERR] = "日志归档回滚错误";
		message[LOG_ROLLBACK_ALREADY] = "已进行过日志回滚操作";
		message[LOG_HAD_ONFILE] = "不存在可归档错误日志";
		message[ERRORLOG_CREATE_ERR] = "错误日志创建错误";
		message[ERRORLOG_DATA_NULL] = "错误日志数据为空";
		message[ERRORLOG_ID_ERR] = "错误日志ID为空或不合法";
		message[ERRORLOG_ONFILE_ERR] = "错误日志归档错误";
		message[ERRORLOG_ROLLBACK_ERR] = "错误日志归档回滚错误";
		message[ERRORLOG_ROLLBACK_ALREADY] = "已进行过错误日志回滚操作";
		message[ERRORLOG_NOT_EXIST] = "不存在可归档错误日志";
		
		//印章错误码 150~179
		message[SEAL_UPDATE_ERR] = "印章更新错误";
		message[SEAL_INSERT_ERR] = "印章插入错误";
		message[SEAL_NAME_EXIST] = "印章注记名重复";
		message[SEAL_NO_EXIST] = "印章不存在";
		message[SEAL_STATUS_UNCHANGE] = "印章状态未改变（被操作的印章已经是要被改变成的状态）";
		message[SEAL_REVOKED] = "该印章已经被注销";
		message[SEAL_STATUS_ERR] = "印章状态值不合法";
		message[SEAL_TYPE_ERR] = "印章类型不合法";
		message[SEAL_NAME_ERR] = "印章注记名不合法";
		message[SEAL_AUTHORITY_ERR] = "印章权限不合法";
		message[SEAL_REMAIN_COUNT_ERR] = "印章剩余使用次数不合法";
		message[SEAL_NO_BELONG_USER] = "印章不属于该用户";
		message[SEAL_STATUS_NO_NORMAL] = "印章无效（已冻结或注销）";
		message[SEAL_REMAIN_COUNT_LESS] = "印章可使用次数不足";
		message[SEAL_NO_SUPPORT_DOCTYPE] = "印章暂不支持此文档类型";
		message[SEAL_NO_AUTHORITY] = "印章没有权限处理此类型文档";
		message[SEAL_OVER_DUE] = "印章已过期";
		message[SEAL_BEFORE_BEGINTIME] = "未到印章开始使用时间";
		message[SEAL_HANDLE_ERR] = "印章句柄不合法";
		message[SEAL_FREEZE_OR_REVOKED] = "该印章已经被冻结或注销";
		message[SEAL_ESEAL_NULL] = "印章数据为空";
		
		message[OFFLINE_AUTH_INSERT_ERR] = "离线授权插入错误";
		
		//签章错误码 200~
		message[ESIGN_DATA_NULL] = "签章数据为空";
		message[ESIGN_NO_EXIST] = "签章不存在";
		message[ESIGN_UPDATE_ERR] = "签章更新错误";
		message[ESIGN_COUNT_PARAM_ERR] = "签章次数参数错误";
		message[ESIGN_PRINT_COUNT_LESS] = "签章可打印次数不足";
		message[ESIGN_CHECK_INSERT_ERR] = "验证方式插入错误";
		message[ESIGN_CHECK_UPDATE_ERR] = "验证方式更新错误";
		message[ESIGN_INSERT_ERR] = "签章插入错误";
		message[ESIGN_PRE_NO_EXIST] = "上一个签章不存在";
		message[ESIGN_DOC_DATA_ERR] = "文档数据为空或过长";
		message[ESIGN_DOC_TYPE_ERR] = "文档类型不合法";
		message[ESIGN_PRE_ID_ERR] = "上一签章ID错误";
		message[ESIGN_TBS_ERR] = "待签数据不合法";
		message[ESIGN_SIGN_ERR] = "签名值不合法";
		message[ESIGN_ESIGN_ERR] = "签章数据不合法";
		message[ESIGN_ISHASH_NULL] = "是否是hash为空";
		
		message[TIMESTAMP_INSERT_ERR] = "时间戳插入错误";
		message[TIMESTAMP_UPDATE_ERR] = "时间戳更新错误";
		message[TIMESTAMP_ISUSE_NULL] = "时间戳是否使用为空";
		
		//公共模块-用户认证模块
		message[USER_AUTH_ERR] = "用户认证错误";
		message[USER_AUTH_REGISTER] = "用户认证设置错误";
		message[USER_AUTH_NULL] = "用户认证信息不存在";
		message[USER_AUTH_INSERT_ERR] = "用户认证信息添加失败";
		message[PASSWORD_UPDATE_ERR] = "用户密码修改错误";
		message[USER_NAME_PWD_AUTH_EXISITS] = "用户名密码认证信息存在";
		message[USER_ROLE_RELATION_NULL] = "用户角色关系为空";
		message[PASSWORD_NULL] = "密码为空";
		message[WRONG_PASSWORD] = "密码错误";
		message[SET_USER_CERT_AUTH_ERR] = "设定用户证书认证错误";
		message[AUTH_MODE_ERR] = "认证方式值错误";
		message[USERCERT_SN_NULL] = "此证书序列号为空";
		message[USERCERT_MODIFY_ERR] = "证书认证修改错误";
		message[USERAUTH_SN_ISSUER_EXIST] = "认证证书序列号和颁发者已存在";
		message[USERAUTH_KEYSERIAL_EXIST] = "认证证书key序列号已存在";
		message[USERAUTH_IS_NULL] = "用户认证信息为空";
		message[USERCERT_KERSERIAL_NULL] = "用户key序列号为空";
		message[USER_NAME_EXIST] =  "该代理点已有此用户名";
		message[USERCERT_KEYID_DIFF] = "证书的密钥ID不一致";
		message[KEYPAIR_ERROR]="密钥数据长度错误";
 	}
	
	public static String getMessage(int code) {
		if (message[code] == null) {
			return "未知错误";
		}
		return message[code];
	}
	
	
	/*
	public static final int SUCCESS = 0;//成功
	public static final int PARAM_GET_ERR = 1;//获取参数失败
	public static final int PARAM_NULL = 2;//参数为空
	public static final int PARAM_ERR = 3;//参数错误
	public static final int DATA_INSERT_ERR = 4;//数据插入错误
	public static final int PROXY_ID_ERR = 5;//代理点ID为空或不合法
	public static final int ID_ERR = 6;//ID为空或不合法
	public static final int DATA_NULL = 7;//数据为空
	public static final int USER_ID_ERR = 8;//用户ID为空或不合法
	public static final int NOTHIING_DELETE = 9;//没有可删除的数据
	public static final int IMAGE_DELETE_ERR = 10;//印模删除错误
	public static final int APPLY_NO_EXIST = 11;//印章申请不存在（没有此id的印章申请记录）
	public static final int APPLY_UPDATE_ERR = 12;//印章申请更新错误
	public static final int APPLY_TYPE_ERR = 13;//申请类型不合法
	public static final int SEAL_UPDATE_ERR = 14;//印章更新错误
	public static final int SEAL_INSERT_ERR = 15;//印章插入错误
	public static final int SEAL_NAME_EXIST = 16;//印章注记名重复
	public static final int SEAL_NO_EXIST = 17;//印章不存在
	public static final int SEAL_STATUS_UNCHANGE = 18;//印章状态未改变（被操作的印章已经是要被改变成的状态）
	public static final int SEAL_REVOKED = 19;//该印章已经被注销
	public static final int APPLY_INSERT_ERR = 20;//印章申请插入错误
	public static final int SEAL_STATUS_ERR = 21;//印章状态值不合法
	public static final int IMAGE_INSERT_ERR = 22;//印模插入错误
	public static final int APPLY_DELETE_ERR = 23;//印章申请删除错误
	public static final int APPLY_CHECK_STATUS_ERR = 24;//印章申请审核状态错误
	public static final int APPLY_CHECK_ISPASS_NULL = 25;//印章申请是否通过为空
	public static final int USER_INSERT_ERR = 26;//用户插入错误
	public static final int USERCERT_NO_EXIST = 27;//用户证书不存在
	public static final int USERCERT_DATA_NULL = 28;//用户证书数据为空
	public static final int USERCERT_INSERT_ERR = 29;//用户证书插入错误
	public static final int IMAGE_NULL = 30;//印模为空
	public static final int RESULT_NULL = 31;//返回结果为空
	public static final int USER_DELETE_ERR = 32;//用户删除错误
	public static final int USER_DATA_NULL = 33;//用户数据为空
	public static final int HTTP_DATA_EXCEPTION= 34;//调用数据模块的http请求异常
	public static final int HTTP_CODE_ERR = 35;//http返回码错误
	public static final int OFFLINE_AUTH_INSERT_ERR = 36;//离线授权插入错误
	public static final int TIMESTAMP_INSERT_ERR = 37;//时间戳插入错误
	public static final int TIMESTAMP_UPDATE_ERR = 38;//时间戳更新错误
	public static final int TIMESTAMP_ISUSE_NULL = 39;//时间戳是否使用为空
	public static final int HTTP_INPUTCREATE_EXCEPTION = 40;//http读入输入流异常
	public static final int USERCERT_UPDATE_ERR = 41;//用户证书更新错误
	public static final int USERCERT_COUNT_ERR = 42;//用户证书数量错误
	public static final int USERCERT_EXISTED = 43;//用户证书已经存在
	public static final int USERCERT_KEYID_NO_EXIST = 44;//用户下不存在此密钥ID
	public static final int USERCERT_DELETE_ERR = 45;//用户证书删除错误
	public static final int TRUST_NULL = 46;//信任链为空
	public static final int USER_NAME_ERR = 47;//用户名不合法
	public static final int USER_UPDATE_ERR = 48;//用户更新错误
	public static final int USERCERT_KEYTYPE_ERR = 49;//密钥算法错误
	public static final int USERCERT_SUBJECT_ERR = 50;//证书主题错误
	public static final int USERCERT_KEYBITS_ERR = 51;//密钥算法长度不合法
	public static final int USERCERT_KEYID_ERR = 52;//密钥ID错误
	public static final int USERCERT_ID_ERR = 53;//用户证书ID错误
	public static final int IMAGE_ID_ERR = 54;//印模ID错误
	public static final int ESIGN_DATA_NULL = 55;//签章数据为空
	public static final int ESIGN_NO_EXIST = 56;//签章不存在
	public static final int ESIGN_UPDATE_ERR = 57;//签章更新错误
	public static final int ESIGN_COUNT_PARAM_ERR = 58;//签章次数参数错误
	public static final int ESIGN_PRINT_COUNT_LESS = 59;//签章可打印次数不足
	public static final int ESIGN_CHECK_INSERT_ERR = 60;//验证方式插入错误
	public static final int ESIGN_CHECK_UPDATE_ERR = 61;//验证方式更新错误
	public static final int EXCEPTION_JSON = 62;//json数据异常
	public static final int EXCEPTION_SQL = 63;//SQL异常
	public static final int EXCEPTION = 64;//系统异常
	public static final int IMAGE_NO_EXIST = 65;//印模为空
	
	static private	String[] messages = {
		"成功",//0
		"获取参数失败",//1
		"参数为空",//2
		"参数错误",//3
		"数据插入错误",//4
		"代理点ID为空或不合法",//5
		"ID为空或不合法",//6
		"数据为空",//7
		"用户ID为空或不合法",//8
		"没有可删除的数据",//9
		"未知错误",//10
		"印章申请不存在",//11
		"印章申请更新错误",//12
		"申请类型不合法",//13
		"印章更新错误",//14
		"印章插入错误",//15
		"印章注记名重复",//16
		"印章不存在",//17
		"印章状态未改变（被操作的印章已经是要被改变成的状态）",//18
		"该印章已经被注销",//19
		"印章申请插入错误",//20
		"印章状态值不合法",//21
		"印模插入错误",//22
		"印章申请删除错误",//23
		"印章申请审核状态错误",//24
		"印章申请是否通过为空",//25
		"用户插入错误",//26
		"用户证书不存在",//27
		"用户证书数据为空",//28
		"用户证书插入错误",//29
		"印模为空",//30
		"返回结果为空",//31
		"用户删除错误",//32
		"用户数据为空",//33
		"调用数据模块的http请求异常",//34
		"http返回码错误",//35
		"离线授权插入错误",//36
		"时间戳插入错误",//37
		"时间戳更新错误",//38
		"时间戳是否使用为空",//39
		"http读入输入流异常",//40
		"用户证书更新错误",//41
		"用户证书数量错误",//42
		"用户证书已经存在",//43
		"用户下不存在此密钥ID",//44
		"用户证书删除错误",//45
		"信任链为空",//46
		"用户名不合法",//47
		"用户更新错误",//48
		"密钥算法错误",//49
		"证书主题错误",//50
		"密钥算法长度不合法",//51
		"密钥ID错误",//52
		"用户证书ID错误",//53
		"印模ID错误",//54
		"签章数据为空",//55
		"签章不存在",//56
		"签章更新错误",//57
		"签章次数参数错误",//58
		"签章可打印次数不足",//59
		"验证方式插入错误",//60
		"验证方式更新错误",//61
		"json数据异常",//62
		"SQL异常",//63
		"系统异常",//64
		"印模为空",//65
		};
	public static String getMessage(int errCode) {
		return messages[errCode];
	}
	*/
}
