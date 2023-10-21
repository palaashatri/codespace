<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Production and Movie Houses</title>
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
<span><i><b>Hi <%=request.getSession().getAttribute("email")%></b></i></span>
<span style="padding-left:550px"><a href="logout.jsp">Logout</a></span>
<h1> Welcome to the Movie Production Houses</h1>
<a href="addProduction.jsp">Add Production</a><br><br>
<a href="viewproductions.jsp">View Productions</a><br><br>
<a href="addMovie.jsp">Add Movie</a><br><br>
<a href="viewMovies.jsp">View Movies</a><br><br>
<a href = "about.html">About</a>
<%
    }
%>
</body>
</html>