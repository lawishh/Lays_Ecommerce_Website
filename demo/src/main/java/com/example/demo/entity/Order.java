package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;



@Entity
@Table(name = "orders")
public class Order {

    @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_seq")
    @SequenceGenerator(
        name = "order_seq",
        sequenceName = "order_sequence",
        allocationSize = 1
    )
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String address;

    private String flavour;
    private int quantity;
    private double unitPrice;
    private double totalPrice;

    // getters & setters
    
    

}
