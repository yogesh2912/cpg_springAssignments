<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emp Management</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

</head>
<body>
<h1 align="center">Emp Management</h1>
<div class="text-center"><a class="btn btn-danger" href="home">Home</a></div><hr/>
<h2 class="text-center">View By ID</h2>
<form action="searchbyid">
<table class="col-md-4 table table light table-striped mx-auto row">
<tr>
<td>Emp ID</td>
<td><input type="number" name="txtid" value="${param.txtid}" required/></td>
<td><input type="submit" value="search" /></td>
</tr>
</table>
</form>
<hr/>
<c:if test="${param.txtid ne null and emodel eq null}">
<div class="col-md-4 mx-auto alert-danger">Employee Not Found</div>

</c:if>

<c:if test="${emodel ne null }">
<table class ="col-md-4 table table-striped mx-auto">
		<tr>
			<td>Emp ID</td>
			<td>${emodel.empId}</td>
		</tr>
		<tr>
			<td>Emp Name</td>
			<td>${emodel.empName}</td>
		</tr>
		<tr>
			<td>Salary</td>
			<td>${emodel.empSal}</td>
		</tr>
		<tr>
			<td>Dept</td>
			<td>${emodel.dept.deptName}</td>
		</tr>
		<tr>
			<td>DOJ</td>
			<td>${emodel.strDoj}</td>
		</tr>
		
		</table>
</c:if>

</body>
</html>