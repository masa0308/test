<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>パスワード変更画面</title>
<style type="text/css">
.red{
 color: red;
 }
</style>
</head>
<body>
<h1>パスワード変更</h1>
<s:if test="errorMessage != ''">
 <s:property value="errorMessage" escape="false" />
</s:if>

<p class="red"><s:if test="wrongMessage != ''">
 <s:property value="wrongMessage" escape="false" />
</s:if></p>

<p>現在のユーザーID、パスワード、変更後のパスワードを入力してください</p>
<s:form action="ChangePasswordConfirmAction">
<s:textfield name="loginUserId" value="" label="ログインID"/><br>
<s:textfield name="loginPassword" value="" label="パスワード"/><br>
<s:textfield name="changePassword" value="" label="変更後のパスワード"/><br>
<s:submit value="登録" />
</s:form>
<p>Homeへ戻る場合<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
</body>
</html>