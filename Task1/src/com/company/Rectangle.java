package com.company;

/**
 * Created by JULIA on 28.02.2018.
 */
public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        this.length = 0.1F;
        this.width = 0.1F;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return this.length;
    }

    public float getWidth() {
        return this.width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return (double)(this.length * this.width);
    }

    public double getPerimeter() {
        return (double)(2.0F * (this.length + this.width));
    }

    public String toString() {
        return "Rectangle[length = " + this.length + ", width = " + this.width + "]";
    }
}
