<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html  
PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"  
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
<form enctype="multipart/form-data"
	action="http://localhost:8080/sys_data/core/upload"
	method="post">
	<input type="file" name="cert" /> <input type="text" name="alais" /><br />
	<input type="submit" value="导入" />
	<%
	request.getContextPath();
	%>
</form>
</body>
</html>
