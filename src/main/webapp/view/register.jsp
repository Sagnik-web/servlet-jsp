<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Register</h2>
	
	<form action="register" method="post">
		<label>Name</label>
		<input name="name"/>
		<label>Email</label>
		<input name="email"/>
		<label>Password</label>
		<input name="password"/>
		<label>Mobile No:</label>
		<input name="phone_no"/>
		<label>Address</label>
		<input name="address"/>
		<button type="submit">Submit</button>
	</form>
</body>
</html>