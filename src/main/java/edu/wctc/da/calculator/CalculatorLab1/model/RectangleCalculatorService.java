/*
 * 
 */
package edu.wctc.da.calculator.CalculatorLab1.model;

import java.text.ParseException;

/**
 *
 * @author David Arnell
 */
public class RectangleCalculatorService {

    public RectangleCalculatorService() {
    }
    
    private double length;
    private double width;
    private double area;
    
    public String calculateRectangleArea(String sLength, String sWidth){// throws ParseException{
        
//        try{
//            this.length = Double.parseDouble(sLength);
//            this.width = Double.parseDouble(sWidth);
//        } catch (Exception e){
//            
//        }

            this.length = Double.parseDouble(sLength);
            this.width = Double.parseDouble(sWidth);
                
        area = length * width;
        
        return Double.toString(area);
        
    }
    
    
}
