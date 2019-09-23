<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Form</title>
<!-- <link type="text/css" rel="stylesheet" -->
<%-- 	href="${pageContext.request.contextPath}/files/css/style.css"> --%>
</head>
<body>
	<h2>List Of Users in dataBase:</h2>
	<hr />
	<table border="1">
		<tr>
			<th>User Id</th>
			<th>Name</th>
			<th>Password</th>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.userId}</td>
				<td>${user.username}</td>
				<td>${user.password}</td>
				<td>${user.firstName}</td>
				<td>${user.lastName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>