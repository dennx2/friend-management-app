<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List My Friends</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

	<sql:setDataSource var="dataSource" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/a4_jaydenn" user="root"
		password="root" />

	<sql:query var="queryResult" dataSource="${dataSource}">
  SELECT * FROM friend;
</sql:query>


	<h1>My Friend Database</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Age</th>
				<th>Fav Color</th>
				<th></th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="row" items="${queryResult.rows}">

				<tr>
					<td><c:out value="${row['friend_id']}" /></td>
					<td><c:out value="${row['friend_name']}" /></td>
					<td><c:out value="${row['email_addr']}" /></td>
					<td><c:out value="${row['age']}" /></td>
					<td><c:out value="${row['favorite_color']}" /></td>
					<td><form id="myform" method="POST" action="Delete">
							<input type="hidden" name="friendIdToDelete" value="${row['friend_id']}"> 
							<button class="deleteButton" type="submit">Delete</button>
						</form>
					</td>
				</tr>

			</c:forEach>
		</tbody>
	</table>
	
	<br>
	<form id="addNewFriend" method="POST" action="AddForm">				
		<button type="submit">Add a New Friend</button>
	</form>

</body>
</html>