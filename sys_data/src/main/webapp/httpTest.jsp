<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="http://libs.baidu.com/jquery/1.9.0/jquery.js" ></script>  
<script type="text/javascript" src="jquery.json.min.js" ></script> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="http://localhost:8080/timestamp/sign/applytimestamp" method="post">
签名数据:<input type="text" id="data" name="data">
安全策略:<select name="algorithm">
<option value="0">SHA</option>
<option value="1">MD5</option>
</select>
<button type="submit" value="确定" id="1">确定</button>
</form>
</body>
</html>