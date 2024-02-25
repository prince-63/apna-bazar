package com.apnabazar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Product extends BaseEntity{
    @Id
    private int productId;
    private String productName;
    private int productPrice;
    private int productRating;
    private String productImageLink;
}
