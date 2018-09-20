<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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


	<table>
	    <!-- here should go some titles... -->
	    <tr>
	        <th>PlayerID</th>
	        <th>PokemonOffer</th>
	        <th>Pokemon</th>
	       
	        <th>Agreed</th>
	        
	    </tr>
	    <c:forEach items='${mytrades}' var="trade">
	    <tr>
	        <td>
	            <c:out value="${trade.userIDOffered}" />
	        </td>
	       
	        <td>
	            <c:out value="${trade.pokemon}" />
	        </td>
	        
	         <td>
	            <c:out value="${trade.pokemonOffered}" />
	        </td>
	        
	        <td>
	            <c:out value="${trade.agreed}" />
	        </td>
	        
	    </tr>
	    </c:forEach>
	</table>


</body>
</html>