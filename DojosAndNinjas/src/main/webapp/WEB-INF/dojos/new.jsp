<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Dojo</title>
</head>
<body>
	<div class="containter">
		<div class="h3">New Dojo</div>
		
		<form:form action="/newDojo" method="post" modelAttribute="dojo">

			<form:label path="name">Name</form:label>
			<form:errors path="name"></form:errors>
			<form:input type="text" path="name" name="name"></form:input>

			<input type="submit" value="Create">
		</form:form>
	</div>
</body>
</html>