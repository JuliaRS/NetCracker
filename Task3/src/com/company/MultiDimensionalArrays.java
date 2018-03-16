package com.company;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by JULIA on 16.03.2018.
 */
public class MultiDimensionalArrays {
    public void taskA(){
        System.out.println("***TASK A***");
        int n = 8, mas[][] =new int[n][n];
        long multiMain = 1, multiSecondary = 1, sumMain = 0, sumSecondary = 0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++) {
                mas[i][j] = 1 + (int) (101 * Math.random());
                if(i==j) {
                    multiMain*=mas[i][j];
                    sumMain +=mas[i][j];
                }
                else
                    if (i == (n-j+1)){
                        multiSecondary*=mas[i][j];
                        sumSecondary +=mas[i][j];
                    }
                }
        printArray(mas,n,n);
        System.out.println("multiplication main diagonal = " + multiMain + ",multiplication secondary diagonal = " + multiSecondary);
        System.out.println("sum main diagonal = " + sumMain + ",sum secondary diagonal = " + sumSecondary);
    }
    public void taskB(){
        System.out.println("***TASK B***");
        int row = 8, column = 5, mas[][] =new int[row][column], maxRow = 0, maxColumn = 0;
        for(int i=0;i<row;i++)
            for(int j=0;j<column;j++) {
                mas[i][j] = (int) (199 * Math.random()) - 99;
                if(mas[maxRow][maxColumn] < mas[i][j]) {
                    maxRow = i;
                    maxColumn = j;
                }
            }
        printArray(mas,row,column);
        System.out.println("MAX = " + mas[maxRow][maxColumn] + ", index = (" + maxRow + ","+maxColumn+")");
    }
    public void taskC(){
        System.out.println("***TASK C***");
        int row = 8, column = 5, mas[][] =new int[row][column];
        for(int i=0;i<row;i++)
            for(int j=0;j<column;j++) {
                mas[i][j] = (int) (21 * Math.random()) - 10;
            }
        printArray(mas,row,column);
        int maxMultiplication = 0, multiplication, maxIndex = 0;
        for(int i=0;i<row;i++) {
            multiplication = 1;
            for (int j = 0; j < column; j++) {
                multiplication*=mas[i][j];
            }
            if(Math.abs(multiplication) > maxMultiplication){
                maxIndex = i;
                maxMultiplication = Math.abs(multiplication);
            }
        }
        System.out.println("row with max multiplication is " + maxIndex);
    }
    public void taskD(){
        System.out.println("***TASK D***");
        int row = 10, column = 7;
        Integer mas[][] =new Integer[row][column];
        for(int i=0;i<row;i++) {
            for (int j = 0; j < column; j++) {
                mas[i][j] = (int) (101 * Math.random());
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<row;i++)
            Arrays.sort(mas[i], Collections.reverseOrder());
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
    private void printArray(int[][] array,int rows,int columns) {
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
