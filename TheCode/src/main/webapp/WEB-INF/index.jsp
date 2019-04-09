<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>The Code</title>
</head>
<body>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<p>
		<c:out value="${error}" />
	</p>
	<form method="POST" action="/process">
		<label>Guess the code! <input type="text" name="code"></label>

		<button>Submit!</button>
	</form>
</body>
</html>