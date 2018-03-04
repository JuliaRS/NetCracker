package com.company;

public class Main {

    public static void main(String[] args) {
	    MyComplex complex1 = new MyComplex(10,4), complex2 = new MyComplex(-4,6);
        System.out.println(complex1 + ": magnitude = " + complex1.magnitude() + ", argument = " + complex1.argument() + ", conjugate = " + complex1.conjugate());
        System.out.println(complex1+" + " + complex2 + " = " + complex1.addNew(complex2));
        System.out.println(complex1+ " - " + complex2 + " = " + complex1.subtractNew(complex2));
        System.out.println(complex1+" * " + complex2 + " = " + complex1.multiply(complex2));
        System.out.println(complex1+" / " + complex2 + " = " + complex1.divide(complex2));

        double[] c1,c2;
        c1 = new double[3];
        c1[0] = -9;
        c1[1] = 0;
        c1[2] = 8;
        c2= new double[2];
        c2[0] = 13;
        c2[1] = 33;
        MyPolynomial poly1 = new MyPolynomial(c1),poly2 = new MyPolynomial(c2);
        System.out.println(poly1 + ": degree = " + poly1.getDegree());
        System.out.println("x = 5: " + poly1.evaluate(5));
        System.out.println("(" + poly1+")+(" + poly2 + ") = " + poly1.add(poly2));
        System.out.println("(" + poly1+")*(" + poly2 + ") = " + poly1.multiply(poly2));

        Ball ball = new Ball(4,4,1,2,1);
        Container cont = new Container(0,0,10,10);
        System.out.println(ball);
        System.out.println(cont);
        if (cont.collides(ball) == true) {
            ball.move();
            System.out.println("move: " + ball);
        }
    }
}
