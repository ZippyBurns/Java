<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-	ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="display-4">
			<c:out value="${product.name}" />
		</div>

		<div class="row">
		
			<div class="col">
				<c:forEach var="cat" items="${product.categories}">
					<c:out value="${cat.name}" />
				</c:forEach>
			</div>
			
			
			<div class="col">
			<h1>Categories</h1>
			<form:form action="/addCategory" method="POST" modelAttribute="midTableObj">
				<form:select path="category">
					<c:forEach var="cat" items="${allCategories}">
					<form:option value="${cat.id}"><c:out value="${cat.name}"></c:out></form:option>
					</c:forEach>
				</form:select> 
				<form:hidden path="product" value="${product.id}"></form:hidden>
				<input type="submit" class= "btn btn-success">
			</form:form>
			</div>
		</div>

	</div>
</body>
</html>