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
			<td>Employee Id</td>
			<td> ${emodel.eid}</td>
		</tr>
		<tr>
			<td>Employee Name</td>
			<td> ${emodel.ename}</td>
		</tr>
		<tr>
			<td>Employee Salary</td>
			<td> ${emodel.sal}</td>
		</tr>
	
		<tr>
			<td>PF</td>
			<td> ${pf}</td>
		</tr>
		<tr>
			<td>Allowance</td>
			<td> ${requestScope.al}</td>
		</tr>
	</table>
</body>
</html>