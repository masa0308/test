<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri=/struts-tags %>
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
</style>
</head>
<body>
<h1>パスワード変更</h1>
<p>現在のユーザーID、パスワードを入力してください</p>
<s:form action="ChangePasswordAction">
ユーザID：<s:textfield name="loginUserId"/><br>
パスワード:<s:password name="loginPassword"/><br>
<p>変更後のパスワードを入力してください</p>
変更後のパスワード:<s:password name="changepassword"/><br>
</s:form>
</body>
</html>