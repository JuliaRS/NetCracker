package com.company;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by JULIA on 16.03.2018.
 */
public class OneDimensionalArrays {
    public void taskA(int n){
        System.out.println("***TASK A***");
        Integer mas[] =new Integer[n];
        for(int i=0;i<n;i++) {
            mas[i] = (int)(100 * Math.random());
            if (mas[i]%2 == 0)
                mas[i] +=1;
        }
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));
        Arrays.sort(mas, Collections.reverseOrder());
        System.out.println(Arrays.toString(mas));
    }
    public void taskB(){
        System.out.println("***TASK B***");
        int n = 20, mas[] =new int [n], even =0, odd =0; // even - четные,odd - нечетные
        for(int i=0;i<n;i++) {
            mas[i] = (int)(11 * Math.random());
            if(mas[i]%2 == 0)
                even++;
            else
                odd++;
        }
        printArray(mas);
        System.out.println();
        System.out.println("even elements = " + even + "\n" + "odd elements = " + odd);
    }
    public void taskC(){
        System.out.println("***TASK C***");
        int n = 10, mas[] =new int [n];
        for(int i=0;i<n;i++) {
            mas[i] = 1+(int)(100 * Math.random());
        }
        printArray(mas);
        for(int i=1;i<n;i+=2)
            mas[i] = 0;
        System.out.println();
        printArray(mas);
        System.out.println();
    }
    public void taskD(){
        System.out.println("***TASK D***");
        int n = 15, mas[] =new int [n],imax = 0, imin =0;
        for(int i=0;i<n;i++) {
            mas[i] = (int)(101 * Math.random()) - 50;
            if(mas[imax] <= mas[i])
                imax= i;
            else
                if(mas[imin] >= mas[i])
                    imin = i;
        }
        printArray(mas);
        System.out.println();
        System.out.println("max = " + mas[imax] + " , index = " + imax);
        System.out.println("min = " + mas[imin] + " , index = " + imin);
    }
    public void taskE() {
        System.out.println("***TASK E***");
        int n = 10,
                mas1[] =new int [n],
                mas2[] = new int[n];
        double sum1 = 0, sum2 =0;
        for(int i=0;i<n;i++) {
            mas1[i] = (int)(11 * Math.random());
            mas2[i] = (int)(11 * Math.random());
            sum1+=mas1[i];
            sum2+=mas2[i];
        }
        printArray(mas1);
        System.out.println();
        printArray(mas2);
        System.out.println();
        double average1 = sum1 / n,
                average2 = sum2 / n;
        if (average1>average2)
            System.out.println("average the first array " + average1 + " more than average the second array " + average2 );
        else
            if (average1>average2)
                System.out.println("average the second array " + average2 + " more than average the first array " + average1 );
            else
                System.out.println("averages are equal " + average1 );

    }
    public void taskF() {
        System.out.println("***TASK F***");
        int n = 20, mas[] =new int [n] , count0 =0,count1=0;
        for(int i=0;i<n;i++) {
            mas[i] = (int)(3 * Math.random())-1;
            if (mas[i] == 1)
                count1++;
            else
                if(mas[i]==0)
                    count0++;
        }
        printArray(mas);
        System.out.println();
        int max = Math.max(count1,Math.max(count0,mas.length-count0-count1));
        if(max == count0)
            System.out.println("0");
        if(max == count1)
            System.out.println("1");
        if(max == (mas.length-count0-count1))
            System.out.println("-1");

    }
    private void printArray(int[] array){
        for(int i=0;i<array.length;i++)
            System.out.print(array[i] + " " );
    }
}
