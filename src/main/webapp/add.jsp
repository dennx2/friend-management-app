<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Friend</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
	<h1>Add a New Friend</h1>
	<form method="post" action="Add">
		Friend Name: <input type="text" name="fname"> 
		Email Address: <input type="text" name="email"> 
		Age: <input type="text" name="age">
		Favorite Color: <input type="text" name="favcolor"> 
		<button type="submit">Submit</button>
	</form>
</body>
</html>