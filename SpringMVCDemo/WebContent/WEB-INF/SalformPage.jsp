<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<h1 align="center">Employee Deatils</h1>
	<div class="col-md-10 text-right">
	    <span class="m-1">${initParam.slogan}</span>
		<a class="btn btn-danger" href="home.htm">Home</a>
	</div>
	<hr />
	<form action="calsubmit">
			<table class ="col-md-6 table table-striped mx-auto mt-5 mr-1" >
				<tr>
					<td><s:message code="id"/></td>
					<td><input type="number" name="eid" required></td>
				</tr>
				<tr>
					<td><s:message code="name"/></td>
					<td><input type="text" name="ename" required></td>
				</tr>
				<tr>
					<td><s:message code="salary"/></td>
					<td><input type="number" name="sal" required ></td>
				</tr>
				<tr>
					<td> <input type="submit"  value="Calc"></td>
				</tr>
				
			</table>
	</form>
</body>
</html>