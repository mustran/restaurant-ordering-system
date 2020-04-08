package com.example.restaurantordering.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
public class Customer {
    @Id
    String username;

    String name;
    String surname;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "orderedBy")
    List<Order> orders;

    @OneToOne(fetch = FetchType.EAGER)
    Address address;

    private Customer() {}

    private Customer(String username, String name, String surname, Address address, List<Order> orders) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.orders = new ArrayList<>(orders);
    }
}
