<%@page import="com.jsp.dto.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%Admin admin=(Admin)request.getAttribute("update"); %>
	<form action="update" method="post">
		ID: <input type="text" name="id" readonly="readonly" value="<%=admin.getId()%>">
		NAME: <input type="text" name="name" value="<%=admin.getName()%>"> <br>
		PHONE: <input type="tel" name="phone" value="<%=admin.getPhone()%>"> <br>
		EMAIL: <input type="email" name="email" value="<%=admin.getEmail()%>"> <br>
		PASSWORD: <input type="password" name="password" value="<%=admin.getPassword()%>"> <br>
		<input type="submit" value="SaveAdmin">
	</form>
</body>
</html>