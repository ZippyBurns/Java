<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><c:out value="${dojo.name}"></c:out></h3>

	<table>
		<tr>
			<th>First name</th>
			<th>Last name</th>
			<th>age</th>
		</tr>
		<tr>
		<c:forEach items="${dojo.ninjas}" var="x">
		<td><c:out value="${x.firstName}"/></td>
		<td><c:out value="${x.lastName}"/></td>
		<td><c:out value="${x.age}"/></td>
		</c:forEach>
		</tr>
	</table>

</body>
</html>