<%-- 
    Document   : rectangleAreaCalculatorAndSolution
    Author     : David Arnell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab #2</title>
    </head>
    <body>
        <h1>Lab #2</h1>
        <h2>Rectangle Area Calculator</h2>
        <p>
            This calculator calculates the area of a rectangle and displays it on the same page.<br>
            <br>
            The area for the calculator is measured by multiplying the length times the width.
        </p>

        <form id="rectangleDimensionForm" name="rectangleDimensionForm" method="POST" 
              action="${pageContext.request.contextPath}/RectangleCalculatorControllerLab2">
            <!-- input type is "text" will go to the servlet as a HttpServletRequest Object -->
            <!-- The form takes two inputs, length and width -->
            <!-- Each type is controlled to be a number with a step in any length allowing for decimals -->
            Length:<input type="number" name="length" value="" step="any" placeholder="length" required/><br>
            Width:<input type="number" name="width" value="" step="any" placeholder="width" required/><br>
            <input type="submit" name="submit" value="Calculate!"/>            
        </form>

            <h3>
        <%
            if (request.getAttribute("area") != null){
                Object area = request.getAttribute("area");
             out.println("Area: " + area.toString());   
            }
            
        %>
            </h3>

    </body>
</html>
