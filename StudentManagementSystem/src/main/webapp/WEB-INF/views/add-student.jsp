<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Student</title>
</head>
<body>
	<h1>Add New Student</h1>
	<form action="${pageContext.request.contextPath}/save" method="POST">

		<label for="name">Name:</label> <input type="text" name="name"
			id="name" required><br> <br> <label for="email">Email:</label>
		<input type="email" name="email" id="email" required><br>
		<br> <label for="rollNo">Roll No:</label> <input type="text"
			name="rollNo" id="rollNo" required><br> <br> <input
			type="submit" value="Save">
	</form>
	<br>
	<a href="studentList">Back to Student List</a>
</body>
</html>
