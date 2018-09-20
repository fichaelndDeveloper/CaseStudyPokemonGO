<%@ page import="java.util.List" import="Models.*" import ="java.util.ArrayList" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file = "head.html" %>
<%@ include file = "footer.html" %>
<html>


<style>

table {
    border-collapse: collapse;
    position:relative;
	left:5px;
	top:30px;
	width: 75%;
}

table, th, td {
    
    text-align: left;
    border-bottom: 1px solid #ddd;

} 
th {
    background-color: Gray;
    color: white;
} 

</style>

<body>
<div></div>
	<table>
	    <!-- here should go some titles... -->
	    <tr>
	        <th>Pokemonone</th>
	        <th>FriendOne</th>
	        <th>Pokemontwo</th>
	        <th>friendtwo</th>
	        <th>stardust</th>
	        
	    </tr>
	    <c:forEach items='${listofPokemon}' var="trade">
	    <tr>
	        <td>
	            <c:out value="${trade.pokemonone}" />
	        </td>
	       
	        <td>
	            <c:out value="${trade.friendone}" />
	        </td>
	         <td>
	            <c:out value="${trade.pokemontwo}" />
	        </td>
	        <td>
	            <c:out value="${trade.friendtwo}" />
	        </td>
	        <td>
	            <c:out value="${trade.stardust}" />
	        </td>
	    </tr>
	    </c:forEach>
	</table>


</body>	

</html>