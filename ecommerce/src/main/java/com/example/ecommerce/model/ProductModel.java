package com.example.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductModel {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer pId;
    private String pName;
    private String pPrice;
    private String pDescription;
    private String pCategory;
    private String pbrand;
}
