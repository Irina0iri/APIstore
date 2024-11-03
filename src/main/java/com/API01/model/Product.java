package com.API01.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Storage")
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int code;
    @Column
    private String name;
    @Column
    private double price;
    @Column
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
