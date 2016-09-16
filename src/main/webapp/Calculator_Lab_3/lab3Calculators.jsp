<%-- 
    Document   : lab3Calculators
    Author     : David Arnell
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!--%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab #3</title>
    </head>
    <body>
        <br>
        <h3>Calculator Lab #3</h3></br>
        <h2>Calculator for Rectangle, Circle, and Triangles</h2>
        

        <div>
            <form method="POST" action="${pageContext.request.contextPath}/CalculatorLab3Controller" 
                  id="rectangleCalculator" name="rectangleCalculator">
                <h3>Calculate the Area of a Rectangle</h3>
                <p>Enter the Length: <input type="number" step="any" name="length" placeholder="length" value="" required/></p>
                <p>Enter the Width: <input type="number" step="any" name="width" placeholder="width" value="" required/></p>
                <input type="submit" name="submit" value="Calculate Area"/>
            </form>
        </div>
        
        <div>        
            <%
                // Set the values of the Objects displayed by the calculator
                //Object length = "";
                //Object width = "";
                Object rectangleArea = "";
                
                // Test to see if the named attributes are still null
                // if any atribute is null, the String value for that attribute
                // is not requested from the controller
                /*
                if(request.getAttribute("length") != null){
                    length = request.getAttribute("length");
                } else {
                    length = "";
                }
                
                if(request.getAttribute("width") != null){
                    width = request.getAttribute("width");
                } else {
                    width = "";
                }
                */
                
                if(request.getAttribute("rectangleArea") != null){
                    rectangleArea = request.getAttribute("rectangleArea");
                    
                    //Trying to use JSTL/EL for values
                    //<c:set var="length" value="${length}"/>
                    
                    // display values if there is a valid rectangle area
                    
                    // None of the following works but this at least allows the
                    // page to load.
                    out.println("<h3>Length:  ${length} </h3>");
                    out.println("<h3>Width: ${width} </h3>");
                    out.println("<h3>Area: ${rectangleArea} </h3>");
                } else {
                    rectangleArea = "";
                }
            %>        
            
            
        </div>
        
        <br>
        
        <div>
            <form method="POST" action="${pageContext.request.contextPath}/CalculatorLab3Controller" 
                  id="circleCalculator" name="circleCalculator">
                <h3>Calculate the Area of a Circle</h3>
                <p>Enter the Radius: <input type="number" step="any" name="radius" placeholder="radius" value="" required/></p>
                <input type="submit" name="submit" value="Calculate Area"/>
            </form>
        </div>
        
        <div>        
            <%
                // Set the values of the Objects displayed by the calculator
                //Object radius = "";
                Object circleArea = "";
                
                // Test to see if the named attributes are still null
                // if any atribute is null, the String value for that attribute
                // is not requested from the controller
                /*
                if(request.getAttribute("radius") != null){
                    radius = request.getAttribute("radius");
                } else {
                    length = "";
                }
*/
                
                if(request.getAttribute("circleArea") != null){
                    circleArea = request.getAttribute("circleArea");
                    out.println("<h3>Radius: ${raidus} </h3>");                    
                    out.println("<h3>Circle Area: ${circleArea} </h3>");
                } else {
                    circleArea = "";
                }                
            %>        
            
            
        </div>
        
        <br>
        
        <div>
            <form method="POST" action="${pageContext.request.contextPath}/CalculatorLab3Controller" 
                  id="rectangleCalculator" name="rectangleCalculator">
                <h3>Calculate the Area of a Triangle</h3>
                <p>Enter the Base: <input type="number" step="any" name="base" placeholder="base" value="" required/></p>
                <p>Enter the Height: <input type="number" step="any" name="height" placeholder="height" value="" required/></p>
                <input type="submit" name="submit" value="Calculate Area"/>
            </form>
        </div>
        
        <div>        
            <%
                // Set the values of the Objects displayed by the calculator
                //Object base = "";
                //Object height = "";
                Object triangleArea = "";
                
                // Test to see if the named attributes are still null
                // if any atribute is null, the String value for that attribute
                // is not requested from the controller
                /*
                if(request.getAttribute("base") != null){
                    base = request.getAttribute("base");
                } else {
                    base = "";
                }
                
                if(request.getAttribute("height") != null){
                    height = request.getAttribute("height");
                } else {
                    height = "";
                }
                */
                
                if(request.getAttribute("triangleArea") != null){
                    triangleArea = request.getAttribute("triangleArea");
                    
                    out.println("<h3>Base: ${base} </h3>");
                    out.println("<h3>Height ${height} </h3>");
                    out.println("<h3>Triangle Area: ${triangleArea} </h3>");
                } else {
                    triangleArea = "";
                }                
            %>
        </div>
    </body>
</html>
