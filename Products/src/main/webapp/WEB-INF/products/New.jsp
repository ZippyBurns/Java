<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-	ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<div class="display-4">New Product</div>
	<form:form action="/newProduct" method="POST" modelAttribute="productObj">
	<form:label path="name">Product:</form:label>
	<form:input type="text" path="name" class="form-control col-6 mt-2"/>
	<form:label path="description">Description:</form:label>
	<form:input type="text" path="description" class="form-control col-6 mt-2"/>
	<form:label path="price">Price:</form:label>
	<form:input type="number" step="0.01" path="price" class="form-control col-6 mt-2"/>
	
	<input type="submit" value="Create" class="btn btn-success">
	
	</form:form>
	
	</div>
</body>
</html>