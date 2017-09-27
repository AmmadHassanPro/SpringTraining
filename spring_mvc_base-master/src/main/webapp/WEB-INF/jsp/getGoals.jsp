<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Goals</title>
</head>
<body>

<table>
<tr>
<th>Goal ID</th><th>Goal Minutes</th>

</tr>
<tr>
	<c:forEach items="${Goals}" var="goal">
		<tr> 
		
			<td>${goal.id}</td>
			<td>${goal.minutes}</td>
		
		
			<td>	
		<table>
				<tr>
				<th>Exercise Id</th><th>Activity</th><th>Time Spent</th>
				</tr>
				
				<tr>
				<c:forEach items="${goal.exercises}" var="exercise">
				<td>${exercise.id}</td> <td>${exercise.activity}</td> <td>${exercise.minutes}</td>
				</c:forEach> 
				</tr>
			
		</table>
			</td>
			
		</tr>
		
	</c:forEach>
	
</tr>


</table>


</body>
</html>