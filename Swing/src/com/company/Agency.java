package com.company;

public class Agency {
    protected String name;

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    protected int employeeCount;

    public Agency(String name, String city, String phone, int employeeCount) {
        this.name = name;
        this.city = city;
        this.phone = phone;
        this.employeeCount = employeeCount;
    }

    protected String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    protected String phone;
}
