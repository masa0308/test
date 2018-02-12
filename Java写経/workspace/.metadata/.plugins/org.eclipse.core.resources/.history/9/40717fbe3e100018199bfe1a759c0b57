<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<style type="text/css">
</style>
<title>Insert title here</title>
</head>
<body>
<s:if test="errorMessage != ''">
<s:property value="errorMessage" escape="false" />
</s:if>
<s:form action="UserCreateConfirmAction">
ログインID:<input type="text" name="loginUserId" value="" />
<br>
ログインPASS:<input type="text" name="loginPassword" value=""/>
<br>
ユーザー名:<input type="text" name="userName" value=""/>
<s:submit value="作成"/>
</s:form>
<br>
前画面に戻る場合は<a href='<s:url action="HomeAction" />'>こちら</a>
</body>
</html>