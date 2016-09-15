<%-- 
    Document   : rectangleAreaSolution
    Created on : Sep 7, 2016, 9:05:51 PM
    Author     : David Arnell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 1</title>
    </head>
    <body>
        
        <h1>Lab 1 Results</h1>
        
        <%
        Object area = request.getAttribute("area");
        %>
        
        
        <h3>Area:  <%out.println(area.toString());%></h3>
        
    </body>
</html>
