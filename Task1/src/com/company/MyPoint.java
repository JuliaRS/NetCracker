package com.company;

/**
 * Created by JULIA on 28.02.2018.
 */
public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] xy = new int[]{this.x, this.y};
        return xy;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt((double)((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y)));
    }

    public double distance(MyPoint point) {
        return Math.sqrt((double)((this.x - point.getX()) * (this.x - point.getX()) + (this.y - point.getY()) * (this.y - point.getY())));
    }

    public double distance() {
        return Math.sqrt((double)(this.x * this.x + this.y * this.y));
    }

    public boolean equals(Object o) {
        if(o == this) {
            return true;
        } else if(!(o instanceof MyPoint)) {
            return false;
        } else {
            MyPoint p = (MyPoint)o;
            return this.getX() == p.getX() && this.getY() == p.getY();
        }
    }

    public int hashCode() {
        byte result = 17;
        int result1 = result * 31 + this.getX();
        result1 = result1 * 31 + this.getY();
        return result1;
    }
}
