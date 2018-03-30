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
<title>商品追加画面</title>
<style type="text/css">
.red{
 color: red;
}
</style>
</head>
<body>
管理者画面
<br>
<s:if test="errorMessage != ''">
 <p class="red"><s:property value="errorMessage" escape="false" /></p>
</s:if><br>
追加したい商品名、値段、品数を入力してください。
<br>
<s:form action="ItemAddConfirmAction"><br>
商品名:<s:textfield name="itemname" value="" label="商品名"/><br>
&nbsp;&nbsp;&nbsp;&nbsp;値段:<s:textfield name="itemprice" value="" label="値段" /><br>
&nbsp;&nbsp;&nbsp;&nbsp;品数:<s:textfield name="itemstock" value="" label="品数"/><br>
<s:submit value="商品登録"/>
</s:form>

管理者画面は<a href ='<s:url action="AdminAction" />'>こちら</a>
ログアウトは<a href ='<s:url action="LogoutAction" />'>こちら</a>

</body>
</html>