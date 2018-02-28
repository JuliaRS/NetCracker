package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(15.0D, "pink");
        System.out.println(circle + ", area = " + circle.getArea());

        Rectangle rectangle = new Rectangle(5.0F, 5.0F);
        System.out.println(rectangle + ", area = " + rectangle.getArea() + ", perimeter = " + rectangle.getPerimeter());

        Employee emp = new Employee(1, "Julia", "Roznova", 100);
        System.out.println(emp + ", annual salary = " + emp.getAnnualSalary());
        System.out.println("salary raise by 50% = " + emp.raiseSalary(50));

        Author[] authors = new Author[]{new Author("Pyshkin", "-", 'm'),
                new Author("Doncova", "doncova@mail.ru", 'f'),
                new Author("Tolstoy", "-", 'm')};
        Book book = new Book("La la la", authors, 150.0D, 5);
        System.out.println(book);

        MyPoint point = new MyPoint(10, 5);
        System.out.println("distance from " + point + " to (0,0) = " + point.distance());
        System.out.println("distance from " + point + " to (10,10) = " + point.distance(10, 10));

        MyTriangle triangle1 = new MyTriangle(1, 3, 3, 1, 7, 7);
        MyTriangle triangle2 = new MyTriangle(1, 3, 3, 1, 7, 7);
        System.out.println(triangle1 + ", perimeter = " + triangle1.getPerimeter() + ", type = " + triangle1.getType());
        System.out.println(triangle1.equals(triangle2));
    }
}
