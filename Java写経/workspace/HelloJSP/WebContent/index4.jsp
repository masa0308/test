<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=" utf-8">
<title>Test</title>
</head>
<body>
<p>こんにちは！</p>
<%!
 static int add(int a, int b){
	return a+b;
}%>

<p>1+2=<%=add(1,2) %></p>
<p>3+4=<%=add(3,4) %></p>

</body>
</html>