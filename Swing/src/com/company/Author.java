package com.company;

/**
 * Created by JULIA on 17.03.2018.
 */
public class Author {
    private String name;
    private int birthYear = 0;
    private int deadYear = 0;

    public Author(String name, int birthYear, int deadYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.deadYear = deadYear;
    }

    public Author(String name) {
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeadYear() {
        return deadYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setDeadYear(int deadYear) {
        this.deadYear = deadYear;
    }

    @Override
    public String toString() {
        return "'" + name + "\' " +
                + birthYear + '-' +
                + deadYear;
    }
}
