/*
 * 
 */
package edu.wctc.da.calculator.CalculatorLab3.model;

/**
 *
 * @author David Arnell
 */
public class Circle {
    
    private double radius;
    private double circleArea;
    private final double PI = 3.141593;

    public Circle() {
    }
    
    public double getAreaOfCircle(double radius){
        this.radius = radius;
        this.circleArea = PI * radius * radius;
        return circleArea;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircleArea() {
        return circleArea;
    }

    public void setCircleArea(double circleArea) {
        this.circleArea = circleArea;
    }
    
    
    
}
