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
<title>商品検索画面</title>
<style type="text/css">
</style>
</head>
<body>
<h3>商品検索</h3>
<p>キーワードを入力してください（部分一致検索可）</p>
<p class="red"><s:if test="errorMessage != ''">
 <s:property value="errorMessage" escape="false" />
</s:if></p>
<s:form action="ItemSearchCompleteAction">
<s:textfield name="itemSearch" value="" label="キーワード" />
</s:form>
</body>
</html>