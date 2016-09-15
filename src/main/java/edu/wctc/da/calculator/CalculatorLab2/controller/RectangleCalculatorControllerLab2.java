/*
 * 
 */
package edu.wctc.da.calculator.CalculatorLab2.controller;

import edu.wctc.da.calculator.CalculatorLab1.model.RectangleCalculatorService;
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
@WebServlet(name = "RectangleCalculatorControllerLab2", urlPatterns = {"/RectangleCalculatorControllerLab2"})
public class RectangleCalculatorControllerLab2 extends HttpServlet {
    
    final String WIDTH = "width";
    final String LENGTH = "length";
    final String AREA = "area";
    
    final String SOLUTIONPAGE = "/Calculator_Lab_2/rectangleAreaCalculatorAndSolution.jsp";

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
        
        RectangleCalculatorService rc = new RectangleCalculatorService();
        
        response.setContentType("text/html;charset=UTF-8");
        
        String length = request.getParameter(LENGTH);
        String width = request.getParameter(WIDTH);
        
        String area = rc.calculateRectangleArea(length, width);
        
        request.setAttribute(AREA, area);
        
        RequestDispatcher view = request.getRequestDispatcher(SOLUTIONPAGE);
        
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
