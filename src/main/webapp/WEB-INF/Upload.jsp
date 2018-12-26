<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC File Upload to Database</title>
</head>
<body>
<div align="Center">
	<h1> Spring MVC File Upload To Database</h1>
	<form method ="post" action = "doUpload" enctype = "multipart/form-data">
		<table border = "0">
			<tr>
				<td> Pick file #1: </td>
				<td><input type ="file" name ="fileUpload" size ="50"/> </td>
			</tr>
			<tr>
				<td> Pick a file #2: </td>
				<td><imput type ="file" name = "fileUpload" size ="50"/> </td>
			</tr>
			<tr>
				<td colspan = "2" align = "center"> <input type ="submit" value ="Upload" /></td>
			</tr>
		</table>		
</body>
</html>