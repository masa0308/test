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
<title>商品削除確認画面</title>
<style type="text/css">
.red{
     color:red;
}
</style>
</head>
<body>
<s:if test="errorMessage != ''">
<p class="red"><s:property value="errorMessage" escape="false" /></p>
</s:if>
<s:form action="ItemDeleteCompleteAction">
商品ID:<s:property value="itemId" escape="false" />
<s:hidden name="itemId" value="%{itemId}"/>
<br>
商品名:<s:property value="itemName" escape="false" />
<s:hidden name="itemName" value="%{itemName}"/>
<br>
<s:submit value="削除完了" />
</s:form>
管理者画面は<a href='<s:url action="AdminAction" />'>こちら</a>
</body>
</html>