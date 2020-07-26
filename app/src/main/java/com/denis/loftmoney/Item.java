package com.denis.loftmoney;

public class Item {
    public  String name;
    public int price;
    private Integer color;

    public Item(String name, int price, Integer color){
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Integer getColor() {
        return color;
    }
}
