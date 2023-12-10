package org.example.entities;

public class Car {
    private int id;
    private String brand;

    private int price;
    private int year;




    public Car(int id, String brand,  int price, int year) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.year = year;
    }




    public Car() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}