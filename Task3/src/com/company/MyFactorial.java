package com.company;

import java.sql.Time;

/**
 * Created by JULIA on 16.03.2018.
 */
public class MyFactorial {
    int n;
    long startTime;
    MyFactorial(int n) {
        if ( n <0) {
            System.out.println("Not available factorial");
            this.n = 1;
        } else
            this.n = n;
    }
    public int getCycleFactorial() {
        int factorial = 1;
        startTime = System.nanoTime();
        for(int i=2;i<=n;i++) {
            factorial*=i;
        }
        startTime = System.nanoTime() - startTime;
        System.out.println("Get factorial by cycle: " + startTime);
        return factorial;
    }
    public int recursionFactorial(int n) {
        if ( n <= 1) return 1;
        return n*recursionFactorial(n-1);
    }
    public int getRecursionFactorial() {
        int factorial;
        startTime = System.nanoTime();
        factorial = recursionFactorial(n);
        startTime = System.nanoTime() - startTime;
        System.out.println("Get factorial by recursion: " + startTime);
        return factorial;
    }
}
