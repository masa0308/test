<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>Insert title here</title>
<style type="text/css">
</style>
</head>
<body>
登録する内容は以下でよろしいでしょうか？
<s:form action="UserCreateCompleteAction">
ログインID:<s:property value="loginUserId" escape="false"/>
<br>
ログインPASS:<s:property value="loginPassword" escape="false" />
<br>
ユーザー名:<s:property value="userName" escape="false" />
<s:submit value="完了" />
</s:form>
</body>
</html>