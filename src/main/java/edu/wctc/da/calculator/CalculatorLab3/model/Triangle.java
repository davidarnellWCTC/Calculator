/*
 * 
 */
package edu.wctc.da.calculator.CalculatorLab3.model;

/**
 *
 * @author David Arnell
 */
public class Triangle {
    private double base;
    private double height;
    private double triangleArea;

    public Triangle() {
    }
    
    public double getAreaOfTraingle (double base, double height){
        this.base = base;
        this.height = height;
        this.triangleArea = .5 * base * height;
        
        return triangleArea;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTriangleArea() {
        return triangleArea;
    }

    public void setTriangleArea(double triangleArea) {
        this.triangleArea = triangleArea;
    }
    
    
    
}
