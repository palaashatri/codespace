<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.example.productionproject.model.*, com.example.productionproject.dao.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Productions</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
</head>
<body>

<%
    if ((session.getAttribute("email") == null) || (session.getAttribute("email") == "")) {
%>
You are not logged in<br/>
<span>Please <a href="index.html"> Login</a></span>
<%} else {
%>
<%
	ProductionDao pd = new ProductionDao();
	List<Production> li = pd.getAllProductions();
%>
<a href="dashboard.jsp">Home</a>
<table>
<tr>
<th>Id</th>
<th>Name</th>
<th>Address</th>
<th>Year Begun</th>
<th>Owner Name</th>
<th>Date Begun</th>
</tr>

<%for(Production p:li){ %>
<tr>
<td><%= p.getProductionId()%></td>
<td><%= p.getProductionName()%></td>
<td><%= p.getAddress() %></td>
<td><%= p.getDateOfStarted() %></td>
<td><%= p.getOwnerName() %></td>
<td><%= p.getDateStarted()%></td>
<td><a href="updateProduction.jsp?id=<%=p.getProductionId()%>">Edit Production</a>
<td><a href="deleteProduction.jsp?id=<%=p.getProductionId() %>">Delete Production</a>
</tr>
<% } %>
<%
    }
%>
</table>
</body>
</html>