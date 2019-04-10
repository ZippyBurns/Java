<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
<h1>results <% %></h1>
<p><c:out value="${name}"/></p>
<p><c:out value="${location}"/></p>
<p><c:out value="${language}"/></p>
<p><c:out value="${comments}"/></p>


</body>
</html>