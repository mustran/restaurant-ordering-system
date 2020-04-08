package com.example.restaurantordering.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Data
@Table(name = "orderbla")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToMany
    @JoinTable(
            name = "order_item",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "item_name")
    )
    Map<MenuItem, Integer> items;
    Long totalPrice;

    @ManyToOne
    Customer orderedBy;
    boolean payingOnline;

    private Order(){}

    public Order(Long id, Map<MenuItem, Integer> items, Long totalPrice, Customer orderedBy, boolean payingOnline) {
        this.id = id;
        this.items = new HashMap<>(items);
        this.totalPrice = totalPrice;
        this.orderedBy = orderedBy;
        this.payingOnline = payingOnline;
    }
}
