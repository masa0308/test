<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:property value="username" />さん、お問い合わせ有難うございます！
<br>
<br>
お問い合わせの種類:
<s:if test='qtype=="company"'>
会社について
</s:if>
<s:if test='qtype=="product"'>
製品について
</s:if>
<s:if test='qtype=="support"'>
アフターサポートについて
</s:if>
<br>
<br>
お問い合わせ内容
<s:property value="body" />
</body>
</html>