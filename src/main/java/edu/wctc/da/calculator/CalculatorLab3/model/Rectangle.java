/*
 * 
 */
package edu.wctc.da.calculator.CalculatorLab3.model;

/**
 *
 * @author David Arnell
 */
public class Rectangle {
    
    private double length;
    private double width;
    private double rectangleArea;

    public Rectangle() {
    }
    
    public double getAreaOfRectangle(double width, double length){
        this.width = width;
        this.length = length;
        this.rectangleArea = width * length;
        
        return rectangleArea;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getRectangleArea() {
        return rectangleArea;
    }

    public void setRectangleArea(double rectangleArea) {
        this.rectangleArea = rectangleArea;
    }
    
    
    
}
