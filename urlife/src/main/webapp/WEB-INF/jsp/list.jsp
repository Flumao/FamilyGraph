<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>

<title>List</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/list.css" />

</head>

<body>
	<sf:form class="form-wrapper cf" method="post" action="/search">
		<input type="text" name="name" placeholder="Search here..." required>
		<input type="submit" id="submit" / value="Go">
	</sf:form>

	<div>
		<c:if test="${not empty users}">
			<table>
				<c:forEach var="user" items="${users}">
					<tr>
						<td>
							<a href="show/${user.personId}">
								${user.personName}, 
								<c:if test="${user.personGender == false}">男</c:if>
								<c:if test="${user.personGender == true}">女</c:if>, 
								${user.personDynasty}, 
								${user.personAddr}
							</a>
						</td>
					</tr>
				</c:forEach>
			</ul>
		</c:if>
	</div>
</body>
</html>
