/*
 * 
 */
package edu.wctc.da.calculator.CalculatorLab3.model;

/**
 *
 * @author David Arnell
 */
public class Lab3CalculatorService {
    
    private final double PI = 3.141593;

    /*
    Constructor for the Calculator Service Model
    */
    public Lab3CalculatorService() {
    }    
        
    
    /**
     * This method takes two string values of the width and height of a 
     * rectangle and returns a string value of the rectangles area.
     * @param width - String value of the rectangle width
     * @param height - String value of the rectangle height
     * @return 
     */
    public String CalculateAreaOfRectangle(String sWidth, String sHeight){
        
        // variables starting with an "s" indicate a String variable
        // variables starting with a "d" indicate a Double variable
        
        double dArea = 0;
        String sArea = "0";
        
        double dWidth = Double.parseDouble(sWidth);
        double dHeight = Double.parseDouble(sHeight);
        
        dArea = dWidth * dHeight;
        
        sArea = String.valueOf(dArea);
        
        return sArea;
    }
    
    /**
     * this method takes the radius of a circle and calculates the area.
     * @param radius - String value of the radius
     * @return 
     */
    public String CalculateAreaOfCircle(String sRadius){
        
        // variables starting with an "s" indicate a String variable
        // variables starting with a "d" indicate a Double variable
                
        String sArea = "0";
        double dRadius = 0;
        double dArea = 0;
        
        dRadius = Double.parseDouble(sRadius);
        
        dArea = PI * dRadius * dRadius;
        
        sArea = String.valueOf(dArea);
        
        return sArea;
    }
    
    /**
     * This method takes the string values of a triangle's base and height and
     * calculates the area of that triangle.
     * The area is returned as a String value.
     * @param base - String value of the traingle's base
     * @param height - String value of the triangle's height
     * @return 
     */
    public String CalculateAreaOfTriangle(String sBase, String sHeight){
        
        String sArea = "0";
        
        double dArea = 0;
        double dBase = Double.parseDouble(sBase);
        double dHeight = Double.parseDouble(sHeight);
        
        // the area of a triangle is 1/2 the base times the height
        dArea = 0.5 * dBase * dHeight;
        
        // The method returns a string value of the area
        sArea = String.valueOf(dArea);
        
        return sArea;        
    }
    
}
