<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<form action="emisubmit">
			<table class ="col-md-6 table table-striped mx-auto mt-5 mr-1" >
				<tr>
					<td>Customer Name</td>
					<td><input type="text" name="txtname" required></td>
				</tr>
				<tr>
					<td>Loan Amount</td>
					<td><input type="number" name="txtawt" required></td>
				</tr>
				<tr>
					<td>Years</td>
					<td><input type="number" name="txtyears" required min="5" max="25"></td>
				</tr>
				<tr>
					<td> <input type="submit"  value="Calc EMI"></td>
				</tr>
				
			</table>
	</form>
</body>
</html>