package com.learn.model;

import lombok.Data;

@Data
public class Product {
    private int id;
    private String name;
    private int price;
    private int rating;
    private String imageLink;
}
