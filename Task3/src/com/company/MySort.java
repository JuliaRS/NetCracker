package com.company;

import java.util.Arrays;

/**
 * Created by JULIA on 14.03.2018.
 */
public class MySort {
    int n;
    int massiv[];
    long startTime;
    public MySort(int n) {
        this.n = n;
        massiv= new int[n];
        for(int i=0;i<n;i++) {
            massiv[i] = (int)(1000 * Math.random());
        }
    }
    public void bubleSort(){
        int mas[] = new int[n];
        for (int i=0;i<n;i++){
            mas[i] = massiv[i];
        }
        startTime = System.nanoTime();
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(mas[j] > mas[j+1]) {
                    mas[j] +=mas[j+1];
                    mas[j+1] = mas[j] - mas[j+1];
                    mas[j] = mas[j] - mas[j+1];
                }
            }
        }
        startTime = System.nanoTime() - startTime;
        System.out.println("Bubble sort: " + startTime);
        /*for(int i=0;i<n;i++) {
            System.out.print(mas[i] + " ");
        }*/
    }
    public void selectionSort(){
        int mas[] = new int[n];
        for (int i=0;i<n;i++){
            mas[i] = massiv[i];
        }
        startTime = System.nanoTime();
        int imin;
        for(int i=0;i<n;i++){
            imin = i;
            for(int j=i+1;j<n;j++){
                if (mas[j] < mas[imin]){
                    imin = j;
                }
            }
            if (i != imin) {
                mas[i] += mas[imin];
                mas[imin] = mas[i] - mas[imin];
                mas[i] = mas[i] - mas[imin];
            }
        }
        startTime = System.nanoTime() - startTime;
        System.out.println("Selection sort: " + startTime);
        /*for(int i=0;i<n;i++) {
            System.out.print(mas[i] + " ");
        }*/
    }
    public void standartSort(){
        int mas[] = new int[n];
        for (int i=0;i<n;i++){
            mas[i] = massiv[i];
        }
        startTime = System.nanoTime();
        Arrays.sort(mas);
        startTime = System.nanoTime() - startTime;
        System.out.println("Arrays.sort: " + startTime);
        /*for(int i=0;i<n;i++) {
            System.out.print(mas[i] + " ");
        }*/
    }
}
