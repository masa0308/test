<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="BuyItemAction">
商品名：<s:property value="session.buyItem_name" /><br>
値段：<s:property value="session.buyItem_price" />円<br>
購入個数
<select name="count">
<option value="1" selected="selected">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
</select><br>
支払い方法
<input type="radio" name="pay" value="1" checked="checked">現金払い
<input type="radio" name="pay" value="2">クレジットカード<br>
<s:submit value="購入"/>
</s:form>
前画面に戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a>
マイページは<a href='<s:url action="MyPageAction" />'>こちら</a>

</body>
</html>