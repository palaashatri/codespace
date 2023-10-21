<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Production</title>
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
<a href="dashboard.jsp">Home</a>
<h2> Add a new Production</h2><br>
<form action="./InsertProductionController" method="post">
Production Id: <input type="number" name="pid"><br><br>
Production Name: <input type="text" name="pname"><br><br>
City/Address: <input type="text" name="address"><br><br>
Year Begun: <input type="number" name="year"><br><br>
Owner Name: <input type="text" name="oname"><br><br>
Date Started: <input type="date" name="datestarted"><br><br>
<input type="submit" value="Insert Production"><br><br>
</form>
<%} %>
</body>
</html>