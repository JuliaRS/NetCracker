package com.company;

/**
 * Created by JULIA on 04.03.2018.
 */
public class MyComplex {
    private double real;
    private double imag;
    // Constructors
    MyComplex() {
        real = 0;
        imag = 0;
    }
    MyComplex(double real,double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Methods
    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public double getReal() {
        return real;
    }

    public void setValue(double real,double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (real == 0 && imag == 0) return "(0)";
        if (real == 0) return "(" + imag + "i)";
        if (imag==0) return "("+ real + ")";
        if (imag < 0) return "("+ real + imag + "i)";
        return "("+ real + "+" + imag + "i)";
    }

    public boolean isReal() {
        if (real == 0) return false;
        return true;
    }

    public boolean isImaginary() {
        if (imag == 0) return false;
        return true;
    }

    public boolean equals(double real,double imag) {
        if (real == getReal() && imag == getImag()) return true;
        return false;
    }

    public boolean equals(MyComplex another) {
        if (another.getReal() == getReal() && another.getImag() == getImag()) return true;
        return false;
    }

    public double magnitude() {
        return Math.sqrt(real*real+imag*imag);
    }

    public double argument() {
        return Math.atan(imag/real);
    }

    public MyComplex add(MyComplex right) {
        real+= right.getReal();
        imag+=right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex complex = new MyComplex(getReal()+right.getReal(),getImag()+right.getImag());
        return complex;
    }

    public MyComplex subtract(MyComplex right) {
        real-= right.getReal();
        imag-=right.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        MyComplex complex = new MyComplex(getReal()-right.getReal(),getImag()-right.getImag());
        return complex;
    }

    public MyComplex multiply(MyComplex right) {
        double r = real , i = imag;
        setReal(r*right.getReal() - i*right.getImag());
        setImag(i*right.getReal() + r*right.getImag());
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double r = real , i = imag ,
                del = right.getImag()*right.getImag() + right.getReal()*right.getImag();
        setReal((r*right.getReal() + i*right.getImag())/del);
        setImag((i*right.getReal() - r*right.getImag())/del);
        return this;
    }

    public MyComplex conjugate() {
        MyComplex complex = new MyComplex(getReal(),getImag()*(-1));
        return complex;
    }
}
