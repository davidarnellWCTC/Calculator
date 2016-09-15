<%-- 
    Document   : home
    Created on : Sep 7, 2016, 9:00:06 PM
    Author     : David Arnell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator Home Page</title>
    </head>
    <body>
        <h1>Class 4 Lab</h1>
        <h2>Links for Lab #1, Lab #2, Lab #3</h2>
        
        <p>
            This lab contains three different calculators for calculating area.<br>
            
        </p>
                
        <p>
            <b>Lab #1</b><br>
            Calculating the area of a rectangle and displaying the results on a separate page<br>
        </p>   
        <form id="lab1Form" name="lab1Form" method="POST" action="Calculator_Lab_1/rectangleAreaCalculator.jsp">
            <input type="submit" name="submit" value="Lab #1"/>            
        </form></br>
        
        <p>
            <b>Lab #2</b><br>
            Calculating the area of a rectangle and displaying the results on the same page<br>
        </p>   
        <form id="lab2Form" name="lab2Form" method="POST" action="Calculator_Lab_2/rectangleAreaCalculatorAndSolution.jsp">
            <input type="submit" name="submit" value="Lab #2"/>            
        </form></br>
        
        <p>
            <b>Lab #3</b><br>
            Calculating the area of a rectangle, circle, and triangle and displaying the results on the same page<br>
        </p>   
        <form id="lab3Form" name="lab3Form" method="POST" action="Calculator_Lab_3/lab3Calculators.jsp">
            <input type="submit" name="submit" value="Lab #3"/>            
        </form></br>
    </body>
</html>
