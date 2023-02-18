package com.example.instagram.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_id")
public class User {
    @Id
    @Column(value="user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String fname;
    private String lname;
    private Integer age;
    private String phoneno;
    private String mail;
}
