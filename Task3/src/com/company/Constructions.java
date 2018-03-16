package com.company;


/**
 * Created by JULIA on 16.03.2018.
 */
enum numbers{
    one,
    two,
    three,
    four,
    five,
    six,
    seven,
    eight,
    nine,
    ten,
    eleven,
    twelve,
    thirteen,
    fourteen,
    fifteen
}
public class Constructions {
    int n = 50, mas[] = new int[n];
    public Constructions(){
        for(int i=0;i<n;i++)
            mas[i] = (int)(Math.random()*11);
    }
    public void getNumberCase(numbers number){
        long startTime = System.nanoTime();
        switch (number){
            case one:
                System.out.println(number.ordinal()+1);
                break;
            case two:
                System.out.println(number.ordinal()+1);
                break;
            case three:
                System.out.println(number.ordinal()+1);
                break;
            case four:
                System.out.println(number.ordinal()+1);
                break;
            case five:
                System.out.println(number.ordinal()+1);
                break;
            case six:
                System.out.println(number.ordinal()+1);
                break;
            case seven:
                System.out.println(number.ordinal()+1);
                break;
            case eight:
                System.out.println(number.ordinal()+1);
                break;
            case nine:
                System.out.println(number.ordinal()+1);
                break;
            case ten:
                System.out.println(number.ordinal()+1);
                break;
            case eleven:
                System.out.println(number.ordinal()+1);
                break;
            case twelve:
                System.out.println(number.ordinal()+1);
                break;
            case thirteen:
                System.out.println(number.ordinal()+1);
                break;
            case fourteen:
                System.out.println(number.ordinal()+1);
                break;
            case fifteen:
                System.out.println(number.ordinal()+1);
                break;
            default:
                System.out.println("i don't know this number");
                break;
        }
        startTime = System.nanoTime() - startTime;
        System.out.println("case time = " + startTime);
    }
    public void getNumberIf(numbers number){
        long startTime = System.nanoTime();
        if (number == numbers.one)
            System.out.println(number.ordinal()+1);
        else if(number  == numbers.two)
            System.out.println(number.ordinal()+1);
        else if(number  == numbers.three)
            System.out.println(number.ordinal()+1);
        else if(number  == numbers.four)
            System.out.println(number.ordinal()+1);
        else if(number  == numbers.five)
            System.out.println(number.ordinal()+1);
        else if(number  == numbers.six)
            System.out.println(number.ordinal()+1);
        else if(number  == numbers.seven)
            System.out.println(number.ordinal()+1);
        else if(number  == numbers.eight)
            System.out.println(number.ordinal()+1);
        else if(number  == numbers.nine)
            System.out.println(number.ordinal()+1);
        else if(number  == numbers.ten)
            System.out.println(number.ordinal()+1);
        else if(number  == numbers.eleven)
            System.out.println(number.ordinal()+1);
        else if(number  == numbers.twelve)
            System.out.println(number.ordinal()+1);
        else if(number  == numbers.thirteen)
            System.out.println(number.ordinal()+1);
        else if(number  == numbers.fourteen)
            System.out.println(number.ordinal()+1);
        else if(number  == numbers.fifteen)
            System.out.println(number.ordinal()+1);
        else
            System.out.println("i don't know this number");

        startTime = System.nanoTime() - startTime;
        System.out.println("if-else time = " + startTime);
    }
    public void caseForArray(){
        int counts[]=new int[11];
        for(int i=0;i<counts.length;i++)
            counts[i] = 0;
        long startTime = System.nanoTime();
        for (int i=0;i<n;i++) {
            switch (mas[i]) {
                case 0:
                    counts[0]++;
                    break;
                case 1:
                    counts[1]++;
                    break;
                case 2:
                    counts[2]++;
                    break;
                case 3:
                    counts[3]++;
                    break;
                case 4:
                    counts[4]++;
                    break;
                case 5:
                    counts[5]++;
                    break;
                case 6:
                    counts[6]++;
                    break;
                case 7:
                    counts[7]++;
                    break;
                case 8:
                    counts[8]++;
                    break;
                case 9:
                    counts[9]++;
                    break;
                case 10:
                    counts[0]++;
                    break;
            }
        }
        startTime = System.nanoTime() - startTime;
        System.out.println("case time for array = " + startTime);
    }
    public void ifForArray(){
        int counts[]=new int[11];
        for(int i=0;i<counts.length;i++)
            counts[i] = 0;
        long startTime = System.nanoTime();
        for(int i=0;i<n;i++) {
            if (mas[i] == 0)
                counts[0]++;
            else if (mas[i] == 1)
                counts[1]++;
            else if (mas[i] == 2)
                counts[2]++;
            else if (mas[i] == 3)
                counts[3]++;
            else if (mas[i] == 4)
                counts[4]++;
            else if (mas[i] == 5)
                counts[5]++;
            else if (mas[i] == 6)
                counts[6]++;
            else if (mas[i] == 7)
                counts[7]++;
            else if (mas[i] == 8)
                counts[8]++;
            else if (mas[i] == 9)
                counts[9]++;
            else if (mas[i] == 10)
                counts[10]++;
        }
        startTime = System.nanoTime() - startTime;
        System.out.println("if-else time for array = " + startTime);
    }
}
