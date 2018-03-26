package com.company;

/**
 * Created by JULIA on 17.03.2018.
 */
public class Book {
    private String name;
    private Author author;
    private String description;
    private double price;
    private int qty = 0;

    public Book(){
        name = "";
        author = new Author("",0,0);
        description = "";
        price = 0;
    }

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;

        this.price = price;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author ;

        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQty() {
        return this.qty;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        String str = "Book[name = " + this.name + ", authors = {";

        str = str + author.toString();
        str = str + "}, price = " + this.price + ", qty = " + this.qty + "]";
        return str;
    }

}
