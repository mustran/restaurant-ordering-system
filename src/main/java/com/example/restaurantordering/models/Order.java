package com.example.restaurantordering.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Table(name = "`order`")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToMany
    @JoinTable(
            name = "order_quantity",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "quantity_id")
    )
    List<Quantity> items;

    Long totalPrice;

    @ManyToOne
    Customer orderedBy;
    boolean payingOnline;

    private Order(){}

    public Order(Long id, List<Quantity> items, Long totalPrice, Customer orderedBy, boolean payingOnline) {
        this.id = id;
        this.items = new ArrayList<>(items);
        this.totalPrice = totalPrice;
        this.orderedBy = orderedBy;
        this.payingOnline = payingOnline;
    }
}
