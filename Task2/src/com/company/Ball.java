package com.company;

/**
 * Created by JULIA on 04.03.2018.
 */
public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x,float y,int radius,int speed,int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = (float) Math.cos(direction)*speed;
        yDelta = (float) Math.sin(direction)*speed;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public int getRadius() {
        return radius;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void move() {
        setX(getX()+getxDelta());
        setY(getY()+getyDelta());
    }

    public void reflectHorizontal() {
       setxDelta(getxDelta()*(-1));
    }

    public void reflectVertical() {
        setyDelta(getyDelta()*(-1));
    }

    @Override
    public String toString() {
        return "Ball[(" + x + "," + y+"),speed = (" + xDelta + ","+yDelta+")]";
    }
}
