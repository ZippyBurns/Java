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
	<h3>New Ninjas</h3>
	
	<form:form action="/newNinja" method="post" modelAttribute="ninja">
		<form:select path="dojo">
			<c:forEach items="${dojos}" var ="d">
				<form:option value="${d.id}">
				<c:out value="${d.name}"/>
				</form:option>
			</c:forEach>
		</form:select>
		
		
		<form:label path="firstName">First Name</form:label>
		<form:errors path="firstName"></form:errors>
		<form:input type="text" path="firstName" name="firstName"></form:input>
		
		<form:label path="lastName">Last Name</form:label>
		<form:errors path="lastName"></form:errors>
		<form:input type="text" path="lastName" name="lastName"></form:input>
		
		<form:label path="age">Age</form:label>
		<form:errors path="age"></form:errors>
		<form:input type="text" path="age" name="age"></form:input>

		<input type="submit" value="Create">
	</form:form>
</body>
</html>