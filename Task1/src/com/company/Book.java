package com.company;

/**
 * Created by JULIA on 28.02.2018.
 */
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = new Author[authors.length];

        for(int i = 0; i < authors.length; ++i) {
            this.authors[i] = authors[i];
        }

        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = new Author[authors.length];

        for(int i = 0; i < authors.length; ++i) {
            this.authors[i] = authors[i];
        }

        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        String str = "Book[name = " + this.name + ", authors = {";

        for(int i = 0; i < this.authors.length - 1; ++i) {
            str = str + this.authors[i].toString() + ", ";
        }

        str = str + this.authors[this.authors.length - 1].toString();
        str = str + "}, price = " + this.price + ", qty = " + this.qty + "]";
        return str;
    }

    public String getAuthorNames() {
        String str = "";

        for(int i = 0; i < this.authors.length - 1; ++i) {
            str = str + this.authors[i].getName() + ", ";
        }

        str = str + this.authors[this.authors.length - 1].getName();
        return str;
    }
}
