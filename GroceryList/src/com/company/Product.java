package com.company;

public class Product {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    private String Name;
    private int Price;

    public Product(String name, int price){
        this.Name=name;
        this.Price=price;

    }


    @Override

    public String toString(){

        return "Product: " + Name + "Pris: " + Price;
    }

}
