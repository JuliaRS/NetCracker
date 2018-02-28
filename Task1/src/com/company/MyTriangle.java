package com.company;

/**
 * Created by JULIA on 28.02.2018.
 */
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
        double a = this.v1.distance(this.v2);
        double b = this.v2.distance(this.v3);
        double c = this.v3.distance(this.v1);
        double max = Math.max(c, Math.max(a, b));
        if(max >= a + b + c - max) {
            System.out.println("this triangle is not exist");
        }

    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = new MyPoint(v1);
        this.v2 = new MyPoint(v2);
        this.v3 = new MyPoint(v3);
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);
        double max = Math.max(c, Math.max(a, b));
        if(max >= a + b + c - max) {
            System.out.println("this triangle is not exist");
        }

    }

    public String toString() {
        return "MyTriangle[v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3 + "]";
    }

    public double getPerimeter() {
        return this.v1.distance(this.v2) + this.v2.distance(this.v3) + this.v3.distance(this.v1);
    }

    public String getType() {
        double a = this.v1.distance(this.v2);
        double b = this.v2.distance(this.v3);
        double c = this.v3.distance(this.v1);
        return a == b && b == c?"Equilateral":(a != b && b != c?"Scalene":"Isosceles");
    }

    public boolean equals(Object o) {
        if(this == o) {
            return true;
        } else if(!(o instanceof MyTriangle)) {
            return false;
        } else {
            MyTriangle that = (MyTriangle)o;
            return !this.v1.equals(that.v1)?false:(!this.v2.equals(that.v2)?false:this.v3.equals(that.v3));
        }
    }

    public int hashCode() {
        int result = this.v1.hashCode();
        result = 31 * result + this.v2.hashCode();
        result = 31 * result + this.v3.hashCode();
        return result;
    }
}
