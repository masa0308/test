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
<title>商品確認画面</title>
<style type="text/css">
</style>
</head>
<body>
管理者画面<br>
追加する内容は以下のものでよろしいですか？<br>
<s:form action="ItemAddCompleteAction">
商品名:<s:property value="itemname" escape="false"/>
<s:hidden name="itemname" value="%{itemname}"/>
<br>
値段:<s:property value="itemprice" escape="false" />
<s:hidden name="itemprice" value="%{itemprice}"/>
<br>
品数:<s:property value="itemstock" escape="false" />
<s:hidden name="itemstock" value="%{itemstock}"/>
<br>
<s:submit value="完了"/>
</s:form>
戻る場合は<a href='<s:url action="ItemAddAction" />'>こちら</a>
</body>
</html>

<!--<s:hidden name="itemname" value="%{itemname}"/>  -->