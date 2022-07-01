<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>The Authentication Page</title>
</head>
<body>
    <form action="/login" method="POST">
        Name : <input name="name" type="text" /> Password : <input name="password" type="password" />
        Enter your Email : <input name="email" type="text" />
        <input type="submit" Value="Login"/>
    </form>
</body>
</html>