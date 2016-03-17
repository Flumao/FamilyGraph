<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Your Circle</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/index.css" />
</head>

<body>
	<sf:form class="form-wrapper cf" method="post" action="/search">
		<input type="text" name="name" placeholder="Search here..." required>
		<input type="submit" id="submit"/ value="Go">
	</sf:form>
</body>
</html>
