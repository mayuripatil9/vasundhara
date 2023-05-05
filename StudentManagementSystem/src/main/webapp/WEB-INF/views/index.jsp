<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>
</head>
<body>
	<h1>Student List</h1>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Roll No</th>
     <th>Search_Button</th>

			<th></th>
			<th></th>
		</tr>
		<c:forEach items="${students}" var="student">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.email}</td>
				<td>${student.rollNo}</td>
				
				<td><a href="edit/${student.id}">Edit</a></td>
				<td><a href="deleteStudent?id=${student.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="addStudent">Add New Student</a>
</body>
</html>
