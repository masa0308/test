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
<s:form method="post" action="InquiryCompleteAction">
ユーザー名：<input type="text" name="username" /><br>
お問い合わせの種類<br>
<select name="qtype">
<option value="company">会社について</option>
<option value="product">製品について</option>
<option value="support">サポート</option>
</select>
<br>
お問い合わせ内容：<s:textarea name="body" />
<s:submit value="送信"/>
</s:form>
</body>
</html>