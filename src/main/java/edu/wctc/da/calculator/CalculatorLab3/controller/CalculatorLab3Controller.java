/*
 * 
 */
package edu.wctc.da.calculator.CalculatorLab3.controller;

import edu.wctc.da.calculator.CalculatorLab3.model.Lab3CalculatorService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author David Arnell
 */
@WebServlet(name = "CalculatorLab3Controller", urlPatterns = {"/Lab3Controller"})
public class CalculatorLab3Controller extends HttpServlet {
    
    // no magic numbers/strings/etc.
    private final String LENGTH = "length";
    private final String WIDTH = "width";
    private final String HEIGHT = "height";
    private final String BASE = "base";
    private final String RADIUS = "radius";
    
    private final String RECTANGLEAREA = "rectangleArea";
    private final String TRIANGLEAREA = "triangleArea";
    private final String CIRCLEAREA = "circleArea";
    
    // set the value for the target page
    private final String TARGETPAGE = "lab3Calculators.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        // Instance of the Lab3CalculatorService model to do the calculations
            Lab3CalculatorService calculator = new Lab3CalculatorService();
            
            // Create the variables for the calculators
            String rectangleArea = "";
            String length = "";
            String width = "";
            
            String circleArea = "";
            String radius = "";
            
            String triangleArea = "";
            String base = "";
            String height = "";          
            
            // Check to see if the values are null before assigning a value
            if(request.getParameter(LENGTH) != null && request.getParameter(WIDTH) != null){
                length = request.getParameter(LENGTH);
                width = request.getParameter(WIDTH);
                rectangleArea = calculator.CalculateAreaOfRectangle(width, length);
                
                request.setAttribute(RECTANGLEAREA, rectangleArea);
                request.setAttribute(LENGTH, length);
                request.setAttribute(WIDTH, width);
            }
//            } else {
//                //If there are no parameters for length and width, the 0 value is set
//                request.setAttribute(RECTANGLEAREA, rectangleArea);
//                request.setAttribute(LENGTH, length);
//                request.setAttribute(WIDTH, width);
//            }
            
            // Setting the attributes for the Circle calculator
            if(request.getParameter(RADIUS) != null){
                radius = request.getParameter(RADIUS);
                circleArea = calculator.CalculateAreaOfCircle(radius);
                
                request.setAttribute(RADIUS, radius);
                request.setAttribute(CIRCLEAREA, circleArea);
            }
//            } else {
//                request.setAttribute(RADIUS, radius);
//                request.setAttribute(CIRCLEAREA, circleArea);
//            }
            
            // Setting the attributes for the Triangle calculator
            if(request.getParameter(BASE) != null && request.getParameter(HEIGHT) != null){
                base = request.getParameter(BASE);
                height = request.getParameter(HEIGHT);
                triangleArea = calculator.CalculateAreaOfTriangle(base, height);
                
                request.setAttribute(BASE, base);
                request.setAttribute(HEIGHT, height);
                request.setAttribute(TRIANGLEAREA, triangleArea);
            }
//            } else {
//                request.setAttribute(BASE, base);
//                request.setAttribute(HEIGHT, height);
//                request.setAttribute(TRIANGLEAREA, triangleArea);
//            }
            
            
            
            
            RequestDispatcher view =
                request.getRequestDispatcher(TARGETPAGE);
        view.forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
