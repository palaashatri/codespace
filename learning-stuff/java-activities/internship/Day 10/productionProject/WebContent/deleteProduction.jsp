<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="com.example.productionproject.model.*, com.example.productionproject.dao.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Production</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
</head>
<body>

<%
ProductionDao pd =new ProductionDao();
int id = Integer.parseInt(request.getParameter("id"));
RequestDispatcher rd =null;
if(pd.deleteProduction(id)){
	System.out.println("Successfully Deleted.");
	rd = request.getRequestDispatcher("dashboard.jsp");
	rd.forward(request, response);
}
else {
	System.out.println("Error due to some exception.");
	rd = request.getRequestDispatcher("viewproductions.jsp");
	rd.forward(request, response);
}
%>
</body>
</html>