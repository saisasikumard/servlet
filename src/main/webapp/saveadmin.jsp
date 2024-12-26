<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="saveadmin" method="post">
		NAME: <input type="text" name="name"> <br>
		PHONE: <input type="tel" name="phone"> <br>
		EMAIL: <input type="email" name="email"> <br>
		PASSWORD: <input type="password" name="password"> <br>
		<input type="submit" value="SaveAdmin">
	</form>
</body>
</html>