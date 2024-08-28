<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body >
	<h1>employee.jsp page</h1>
	<c:forEach var="emp" items="${empList}" >
		${emp.empId}&nbsp;&nbsp;&nbsp;&nbsp;${emp.empName}&nbsp;&nbsp;&nbsp;&nbsp;${emp.empSal}<br>
	</c:forEach>
	
</body>
</html>