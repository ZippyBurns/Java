<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="/process">
		<label>Name: <input type="text" name="name"></label>
		<select name="location">
			<option value="berkeley">Berkeley</option>
			<option value="burbank">Burbank</option>
			<option value="sanJose">San Jose</option>
			<option value="seattle">Seattle</option>
		</select>
		<select name="language">
			<option value="python">Python</option>
			<option value="java">Java</option>
			<option value="mean">MEAN</option>
		</select>
		<label><textarea name="comments">Comments...(optional)</textarea></label>
		<button>Submit</button>
		</form>
</body>
</html>