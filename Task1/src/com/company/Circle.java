package com.company;

/**
 * Created by JULIA on 28.02.2018.
 */
public class Circle {
    private double radious;
    private String color;

    public Circle() {
        this.radious = 0.1D;
        this.color = "red";
    }

    public Circle(double radious) {
        this.radious = radious;
    }

    public Circle(double radious, String color) {
        this.radious = radious;
        this.color = color;
    }

    public double getRadious() {
        return this.radious;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 3.141592653589793D * this.radious * this.radious;
    }

    public String toString() {
        return "Circle[radious = " + this.radious + ", color = " + this.color + "]";
    }
}
