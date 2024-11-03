package com.API01.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductAddToDataBaseDTO {
    private int code;
    private String name;
    private Double price;
    private String description;
}
