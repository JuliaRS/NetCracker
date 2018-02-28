package com.company;

/**
 * Created by JULIA on 28.02.2018.
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    int raiseSalary(int percent) {
        this.salary += this.salary * percent / 100;
        return this.salary;
    }

    public String toString() {
        return "Employee[id = " + this.id + ", name = " + this.getName() + ", salary = " + this.salary + "]";
    }
}
