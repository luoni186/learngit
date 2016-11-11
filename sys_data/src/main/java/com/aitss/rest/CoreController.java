package com.aitss.rest;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.aisino.aitss.utils.Base64;

@RestController
@RequestMapping("/core")
public class CoreController {
	@RequestMapping(value = "/upload")
	@ResponseBody
	public String upload(@RequestParam(value = "cert", required = false) MultipartFile file, HttpServletRequest request) throws Exception{
	  /*	System.out.println("开始");  
		//	  public String upload(HttpServletRequest request) throws Exception{	
	   MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = mRequest.getFileMap();
		
		System.out.println(fileMap);
		MultipartFile multipartFile = fileMap.get("cert");
		System.out.println(multipartFile);
		String encode =Base64.encode(multipartFile.getBytes());
		 System.out.println(encode);*/		
        //保存  
        try {    
        	X509Certificate cert=null;
            InputStream fis = file.getInputStream();
            ByteArrayInputStream bais=null;
        	byte value[]=new byte[fis.available()];
        	fis.read(value);
        	bais=new ByteArrayInputStream(value);
        	java.security.cert.CertificateFactory cf=java.security.cert.CertificateFactory.getInstance("X.509");
        	cert=(X509Certificate)cf.generateCertificate(bais);
        	cert.checkValidity();//检查证书目前是否有效
        	String t=Base64.encode(cert.getEncoded());
        	String s=cert.toString();
        	RSAPublicKey pub=(RSAPublicKey)cert.getPublicKey();
        	Date EndTime=cert.getNotBefore();
        	Date BeginTime=cert.getNotAfter();
        	String SN=cert.getSubjectDN().toString();
        	System.out.println(pub.getModulus());//获取证书公钥
        	System.out.println(t);//base64缂栫爜
        	System.out.println(EndTime);
        	System.out.println(SN);
        	System.out.println(BeginTime);
        	System.out.println(request.getParameter("alais"));
            /*byte[] buf = new byte[1024];
            int byteread = 0;
            while ((byteread = inputStream.read()) != -1) {
            	System.out.write(buf, 0, byteread);}*/          
        } catch (Exception e) {  
            e.printStackTrace();  
        } 		
		return "0";
	}
}
