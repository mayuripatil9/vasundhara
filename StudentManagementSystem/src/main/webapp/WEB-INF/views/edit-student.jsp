<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Edit Student</title>
</head>
<form id="form"> 
  <input type="search" id="query" name="q" placeholder="Search...">
  <button>Search</button>
</form>
<body>
	<h1>Edit Student</h1>
	<form method="post" action="${pageContext.request.contextPath}/update" th:object="${student}">
	
		<input type="hidden" name="id" value="${student.id}" /> <label
			for="name">Name:</label> <input type="text" id="name" name="name"
			value="${student.name}" required /><br /> <br /> <label
			for="email">Email:</label> <input type="email" id="email"
			name="email" value="${student.email}" required /><br /> <br /> <label
			for="rollNo">Roll No:</label> <input type="text" id="rollNo"
			name="rollNo" value="${student.rollNo}" required /><br /> <br /> <input
			type="submit" value="Save" />
	</form>
</body>
<body>
<form action="search" method ="GET"></form>
<form id="form"> 
  <input type="search" id="query" name="q" placeholder="Search...">
  <button>Search</button>
</form>
</body>
</html>
