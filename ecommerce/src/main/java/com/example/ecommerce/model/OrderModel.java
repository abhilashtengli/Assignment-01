package com.example.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderModel {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer oId;
    @JoinColumn(name="userId")
    @OneToOne
    private userModel user;
    @JoinColumn(name="pId")
    @OneToMany
    private userModel productId;
    @JoinColumn(name="aId")
    @OneToOne
    private userModel addressId;
    private Integer OProductQuantity;
}
