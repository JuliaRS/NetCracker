package com.company;

/**
 * Created by JULIA on 16.03.2018.
 */
public class MyFigure {
    public void showRectangleFigure(int size) {
        for(int row = 1;row <= size;row++){
            for(int column = 1; column <= size;column++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public void showTriangleFigure(int size) {
        for(int row = 1;row <= size;++row){
            for(int column = 1; column <= (size-row+1);++column) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public void showHourglassFigure(int size) {
        for(int row = 1;row <= size;row++){
            for(int column = 1; column <= size;column++) {
                if (row == 1 || row == size || column == row || column == (size - row+1))
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
