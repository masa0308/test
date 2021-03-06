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
<title>商品一覧画面</title>
<style type="text/css">
table{
   border:solid;
}

th{
   border:solid;
}

td{
   border:solid;
}

.red{
     color:red;
}
</style>
</head>
<body>
<h1>商品一覧</h1>

<s:if test="itemListDTO == null">
<h3>商品情報はありません。</h3>
</s:if>
<table>
<tr>
    <th>ID</th>
    <th>商品名</th>
    <th>価格</th>
    <th>品数</th>
    <th>入力日時</th>
    <th>更新日時</th>
</tr>
<s:iterator value="itemListDTO">
<tr>
    <td><s:property value="id" /></td>
    <td><s:property value="itemName" /></td>
    <td><s:property value="itemPrice" /></td>
    <td><s:property value="itemStock" /></td>
    <td><s:property value="insertDate" /></td>
    <td><s:property value="updateDate" /></td>
</tr>
</s:iterator>
</table>
管理者画面は<a href ='<s:url action="AdminAction" />'>こちら</a>

<h3>商品削除</h3>
<s:if test="errorMessage != ''">
<p class="red"><s:property value="errorMessage" escape="false" /></p>
</s:if>
<s:form action="ItemDeleteAction">
商品ID:<s:textfield name="itemId" value="" label="商品ID"/><br>
商品名:<s:textfield name="itemName" value="" label="商品名"/><br>
<s:submit value="商品削除"/>
</s:form>
</body>
</html>