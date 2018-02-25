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
<title>パスワード変更確認画面</title>
<style type="text/css">
</style>
</head>
<body>
<h3>登録する内容は以下でよろしいでしょうか？</h3>
<s:form action="ChangePasswordCompleteAction">
ログインID:<s:property value="loginUserId" escape="false" /><br>
ログインPASS:<s:property value="loginPassword" escape="false" /><br>
変更後のPASS:<s:property value="changePassword" escape="false" /><br>
<s:submit value="完了" />
</s:form>
</body>
</html>