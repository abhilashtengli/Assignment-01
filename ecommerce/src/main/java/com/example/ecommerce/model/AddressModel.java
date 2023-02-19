package com.example.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AddressModel {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer aId;
    private String aName;
    private String aPhoneNumber;
    private String aZipCode;
    private String aState;
    @JoinColumn(name = "userId")
    @OneToOne
    private userModel user;
}
