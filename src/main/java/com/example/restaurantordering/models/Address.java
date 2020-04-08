package com.example.restaurantordering.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="customer_address")
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String street;
    int streetNumber;
    String city;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "address")
    Customer customer;

    private Address(){}

    public Address(String street, int streetNumber, String city, Customer customer){
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.customer = customer;
    }
}

