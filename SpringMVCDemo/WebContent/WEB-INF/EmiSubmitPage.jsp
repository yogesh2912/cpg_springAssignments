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
	<table class ="col-md-6 table table-striped mx-auto mt-5 mr-1">
		<tr>
			<td>Customer Name</td>
			<td> ${param.txtname}</td>
		</tr>
		<tr>
			<td>Loan Amount</td>
			<td> ${param.txtawt}</td>
		</tr>
		<tr>
			<td>Years</td>
			<td> ${param.txtyears}</td>
		</tr>
	
		<tr>
			<td>Total Amount</td>
			<td> ${requestScope.totalAmount}</td>
		</tr>
		<tr>
			<td>Monthly Amount</td>
			<td> ${requestScope.monthlyAmount}</td>
		</tr>
	</table>


</body>
</html>