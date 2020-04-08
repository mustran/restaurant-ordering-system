package com.example.restaurantordering.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Quantity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    int quantity;

    @ManyToOne
    MenuItem item;

    @ManyToMany(mappedBy = "items")
    List<Order> orders;

    private Quantity() {}

    private Quantity(Long id, int quantity, MenuItem item, List<Order> orders) {
        this.id = id;
        this.quantity = quantity;
        this.item = item;
        this.orders = new ArrayList<>(orders);
    }
}
