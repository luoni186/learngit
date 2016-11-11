package com.aisino.aitss.utils;
import java.io.ByteArrayInputStream;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


//import sun.misc.BASE64Decoder;
public class StringUtil {
	private static final Base64Encoder encoder = new Base64Encoder();
	/**
	 * 去空格反转
	 * "CN=aica, O=aisino, L=Beijing, ST=Beijing, C=CN"
	 * @param str
	 * @return
	 */
	public static String StringTrim(String str){
		String array[]=str.split(", ");
		StringBuilder builder=new StringBuilder(200);
		for(int i=array.length-1;i>0;i--){
			builder.append(array[i]);
			builder.append(",");
   	      }
		builder.append(array[0]);
		return builder.toString();
   }

	 public static String reverseIssuer(String s) {
			String[] list = s.split(", ");
			StringBuilder sb = new StringBuilder();
			for (int i=list.length-1; i>=0; --i) {
				sb.append(list[i] + ",");
			}
			sb.setLength(sb.length()-1);
			return sb.toString();
		}
        
	/**
	 * String to map,用于比较颁发者
	 * @param param
	 * @return
	 */
    public static Map<String,String> StringToMap(String param){
    	Map<String,String> certMap=new HashMap<String,String>();
    	String str[]=param.split(",");
    	for(int i=0;i<str.length;i++){
   		 String arrayStr[]=str[i].split("=");
   		 certMap.put(arrayStr[0], arrayStr[1]);
   	 }
		return certMap; 	
    }
    /**
     * 比较Map值
     * @param map1
     * @param map2
     * @return
     */
    public static boolean isEquals(Map<String,String> map1,Map<String,String> map2){
    	boolean result=true;
    	Set<String> keySet = map1.keySet();
    	for (String key : keySet){
    		String value1= map1.get(key);
 			String value2= map2.get(key);
 			if(!value1.equals(value2)){
 				result=false;
            }
    	}
		return result;
    	
    }
    /**
     * 拼接证书参数, {"proxyId":2,"cert":"MIICczCC"}
     * @param proxyId
     * @param cert
     * @return
     */
    public static String appendCert(int proxyId,String cert){
    	StringBuilder builder=new StringBuilder(200);
    	 builder.append("{\"proxyId\"");
		 builder.append(":");
		 builder.append(proxyId);
		 builder.append(',');
		 builder.append("\"cert\"");
		 builder.append(":");
		 builder.append("\"");
		 builder.append(cert);
		 builder.append("\"");
		 builder.append("}");
		 return builder.toString();
    	
    }
    /**
     * 解码证书
     * @param encode
     * @return
     * @throws CertificateException 
     */
    public static X509Certificate decode(String encode) throws CertificateException{
    	byte[] decode=Base64.decode(encode);
    	CertificateFactory certFactory =  java.security.cert.CertificateFactory.getInstance("X509");
    	X509Certificate x = (X509Certificate)certFactory.generateCertificate(new ByteArrayInputStream(decode));
		return x; 	
    }
    
    public static void main(String args[]) throws Exception{
    	String cert="MIICczCCAdygAwIBAgIEEAI0fzANBgkqhkiG9w0BAQUFADBRMQswCQYDVQQGEwJDTjEQMA4GA1UECBMHQmVpamluZzEQMA4GA1UEBxMHQmVpamluZzEPMA0GA1UEChMGYWlzaW5vMQ0wCwYDVQQDEwRhaWNhMB4XDTEzMTExNzE2MDAwMFoXDTE2MDgxMzE2MDAwMFowJzELMAkGA1UEBhMCQ04xGDAWBgNVBAMMD+S4muWKoeaTjeS9nOWRmDCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAK15WfNpjE8rKAOY7gJiSez0v7EHaz/SLW3NrXAYQQApTq22PccdvKSr4370zrznB6dfqU7eUE1QmoyWkmWFC0cEOZxomosNoOwIcQpnrUh5BIQ6+D7QGTCGECiKTT0wrCXnvrxG3PpBKuFi18a6f1FSTcIgOPmWZrFzPmVe+hfseJC1egLjamCylBu/j3q51dGM63MwPP0cUwVNDfzdU5oYz3QSciFqhQsZzy8RMCrTWIb2Hi1WpszLfe5daxK/W0DX6EpDtwVNyQTG5ZnTOKh3LXOOpm1ZPxwy7Zv/A6maSanz392ppGbOB7NStL7jsmrYQ+YO4xh6MWKTQ0EFl7UCAwEAATANBgkqhkiG9w0BAQUFAAOBgQAUidMGRBM2zVrQjCFtLQNxECafs//wKBLXAsHSMDKaNyjCTKMjnBk/VN74iv9kEDmXaTkHV3ZSbvXS7+rK9Ybv7IpoAejZmjazD7qAeIdyCZ5I43p5oevAO0QknawlxB6bbrHRv6bqQzG3pf/OE5PZwJkxjCeQ9ENyWT/aZiWFzg==";
    	byte[] decode=Base64.decode(cert);
    	CertificateFactory certFactory =  java.security.cert.CertificateFactory.getInstance("X509");
    	X509Certificate x = (X509Certificate)certFactory.generateCertificate(new ByteArrayInputStream(decode));
    	System.out.println(x.getIssuerDN().toString());
    	System.out.println(x.getSubjectDN());
    	//X509Certificate x=decode(cert);
    	Principal subject;
    	//主题
    	subject=x.getSubjectDN();
    	System.out.println(subject);
    	//颁发者
    	System.out.println(x.getIssuerDN().toString());
    	//System.out.println(x.getType().toString());
    	//序列号
    	System.out.println(x.getSerialNumber());
    	System.out.println(x.getPublicKey());
    	//beginTime
    	//endTime
    	System.out.println(x.getNotAfter().toLocaleString());   

  
    }
    
}
