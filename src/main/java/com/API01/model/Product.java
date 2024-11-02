package com.API01.model;

import lombok.Data;

@Data
public class Product {
    private int code;
    private String  name;
    private double price;
    private String description;

    public Product(int code, String name, double price, String description) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
