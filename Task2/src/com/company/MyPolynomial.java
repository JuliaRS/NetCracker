package com.company;

/**
 * Created by JULIA on 04.03.2018.
 */
public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = new double[coeffs.length];
        for(int i=0;i<coeffs.length;i++)
            this.coeffs[i] = coeffs[i];
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public double getCoeffs(int i) {
        if (i>getDegree()) return 0;
        return coeffs[i];
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        if (coeffs[getDegree()] != 0) str.append(coeffs[getDegree()] + "x^" + getDegree());
        for (int i=getDegree()-1;i>0;i--)
        {
            if (coeffs[i] > 0) str.append("+" + coeffs[i] + "x^" + i);
            else
                if (coeffs[i] < 0) str.append(coeffs[i] + "x^" + i);
        }
        if (coeffs[0] > 0) str.append("+" + coeffs[0] );
        else
            if (coeffs[0] < 0) str.append(coeffs[0]);
        return str.toString();
    }

    public double evaluate(double x) {
        double res = coeffs[0];
        for (int i=1;i<getDegree()+1;i++)
        {
            res+=coeffs[i]*x;
            x=x*x;
        }
        return res;
    }

    public MyPolynomial add(MyPolynomial right) {
        int degree = Math.max(getDegree(),right.getDegree());
        double[] c = new double[degree+1];
        for(int i=0;i<degree+1;i++) {
            c[i] = 0;
        }
        for(int i=0;i<coeffs.length;i++) {
            c[i] += coeffs[i];
        }
        for(int i=0;i<right.getDegree()+1;i++) {
            c[i] += right.getCoeffs(i);
        }
        MyPolynomial poly = new MyPolynomial(c);
        return poly;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int degree = getDegree() + right.getDegree();
        double[] c = new double[degree+1];
        for(int i=0;i<degree+1;i++) {
            c[i] = 0;
        }
        for (int i=0;i<getDegree()+1;i++) {
            for(int j=0;j<right.getDegree()+1; j++)
            {
                c[i+j] += coeffs[i]*right.getCoeffs(j);
            }
        }
        MyPolynomial poly = new MyPolynomial(c);
        return poly;
    }
}
