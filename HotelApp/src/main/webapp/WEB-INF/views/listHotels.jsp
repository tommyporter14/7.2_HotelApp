<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<body>
<h1>Results</h1>
<c:forEach var="hotels" items="${hotels}">
	<ul>
	  <li>${hotels.hotelName}, ${hotels.city}, ${hotels.price}</li>
	</ul>
</c:forEach>
	<a href="/">Return to search</a>
</body>
</html>