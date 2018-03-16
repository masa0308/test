<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>購入画面</title>
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
</style>
</head>
<body>
<s:form action="BuyItemAction">
<table>
<tr>
<th>チェック</th>
<th>商品名</th>
<th>値段</th>
<th>購入個数</th>
<th>支払い方法<th>
</tr>

<s:iterator value="session.buyItemList">
<tr>
<td><s:checkbox name="checkList" value="checked" fieldValue="%{id}"/></td>
<td><s:property value="itemName" /></td>
<td><s:property value="itemPrice" /></td>
<td>
<select name="count">
<option value="1" selected="selected">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
</select></td>
<td>
<input type="radio" name="pay" value="1" checked="checked">現金払い
<input type="radio" name="pay" value="2">クレジットカード
</td>
</tr>
</s:iterator>
</table>
<s:submit value="購入"/>
</s:form>
前画面に戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a>
マイページは<a href='<s:url action="MyPageAction" />'>こちら</a>

</body>
</html>