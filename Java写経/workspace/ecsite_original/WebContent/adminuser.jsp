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
<title>管理者画面</title>
<style type="text/css">
</style>
</head>
<body>
管理者画面<br>
商品追加は<a href ='<s:url action="ItemAddAction" />'>こちら</a><br>
商品一覧参照は<a href='<s:url action="ItemListAction" />'>こちら</a>
ログアウトは<a href ='<s:url action="LogoutAction" />'>こちら</a>


</body>
</html>