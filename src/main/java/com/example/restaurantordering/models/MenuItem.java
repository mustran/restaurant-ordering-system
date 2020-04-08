package com.example.restaurantordering.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

enum Size {
    SMALL,
    MEDIUM,
    LARGE
}

@Data
@Entity
@AllArgsConstructor
public class MenuItem {
    @Id
    String name;

    @ManyToMany
    @JoinTable(
            name = "item_ingredient",
            joinColumns = @JoinColumn(name = "item_name"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_name")
    )
    List<Ingredient> ingredients;
    String description;
    boolean sizeAvailable;
    Size size;
    int price;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "items")
    List<Order> orders;

    @ManyToOne
    Category category;

    @OneToMany
    List<Quantity> quantities;

    private MenuItem(){}

    public MenuItem(String name, List<Ingredient> ingredients, String description, boolean sizeAvailable, Size size, int price,Category category, List<Order> orders, List<Quantity> quantities) {
        this.name = name;
        this.ingredients = new ArrayList<>(ingredients);
        this.description = description;
        this.sizeAvailable = sizeAvailable;
        this.size = size;
        this.price = price;
        this.category = category;
        this.orders = new ArrayList<>(orders);
        this.quantities = new ArrayList<>(quantities);
    }
}
