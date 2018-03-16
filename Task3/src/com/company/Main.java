package com.company;

public class Main {

    public static void main(String[] args) {
	    MySort sorts = new MySort(10);
	    sorts.bubleSort();
	    sorts.selectionSort();
	    sorts.standartSort();
		System.out.println("-------------------------");

		MyFactorial factorial = new MyFactorial(5);
		System.out.println(factorial.getCycleFactorial());
		System.out.println(factorial.getRecursionFactorial());
		System.out.println("-------------------------");

		MyFigure figure = new MyFigure();
		figure.showRectangleFigure(5);
		System.out.println();
		figure.showTriangleFigure(8);
		System.out.println();
		figure.showHourglassFigure(7);
		System.out.println("-------------------------");

		OneDimensionalArrays oneDimensionalArrays = new OneDimensionalArrays();
		oneDimensionalArrays.taskA(6);
		oneDimensionalArrays.taskB();
		oneDimensionalArrays.taskC();
		oneDimensionalArrays.taskD();
		oneDimensionalArrays.taskE();
		oneDimensionalArrays.taskF();
		System.out.println("-------------------------");

		MultiDimensionalArrays multiDimensionalArrays = new MultiDimensionalArrays();
		multiDimensionalArrays.taskA();
		multiDimensionalArrays.taskB();
		multiDimensionalArrays.taskC();
		multiDimensionalArrays.taskD();
		System.out.println("-------------------------");

		Constructions constructions = new Constructions();
		constructions.getNumberCase(numbers.twelve);
		constructions.getNumberIf(numbers.twelve);
		constructions.caseForArray();
		constructions.ifForArray();
	}
}
