<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="com.example.productionproject.model.*, com.example.productionproject.dao.*,java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Movie</title>
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
MovieDao md =new MovieDao();
int id = Integer.parseInt(request.getParameter("id"));
Movie m = md.getMovieFromId(id);
%>
<h2> Update Movie</h2><br>
<form action="./UpdateMovieController" method="post">
Movie Id: <input type="number" name="mid" value="<%=m.getMovieId()%>" readonly><br><br>
Movie Name: <input type="text" name="mname" value="<%=m.getMovieName() %>"><br><br>
Hero Name: <input type="text" name="heroname" value="<%=m.getHeroName() %>"><br><br>
Heroine: <input type="text" name="heroine" value="<%=m.getHeroine() %>"><br><br>
Release Date: <input type="date" name="releasedate" value="<%=m.getReleaseDate() %>"><br><br>
Language: <input type="text" name="language" value="<%=m.getLanguage() %>"><br><br>
Length: <input type="number" name="length" value="<%=m.getLength() %>"><br><br>
Movie Type: <input type="text" name="movietype" value="<%=m.getMovieType() %>"><br><br>
Production Id: <input type="number" name="pid" value="<%=m.getProductionId() %>"><br><br>
<input type="submit" value="Update Movie"><br><br>
</form>
<%} %>
</body>
</html>