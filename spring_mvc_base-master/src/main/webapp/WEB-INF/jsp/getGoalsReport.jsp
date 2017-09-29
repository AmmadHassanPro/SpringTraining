<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Goals Report</title>
</head>
<body>

<table>

<th>Goal Minutes</th> <th>Exercise Minutes</th> <th>Activity</th>

	<c:forEach items="${GoalsReport}" var="goal">
	<tr>
	<td>${goal.goalMinutes}</td><td>${goal.exerciseMinutes}</td><td>${goal.activity}</td>
	</tr>
	</c:forEach>



</table>

</body>
</html>