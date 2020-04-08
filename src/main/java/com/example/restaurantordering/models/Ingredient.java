package com.example.restaurantordering.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
public class Ingredient {
    @Id
    Long name;

    @ManyToMany(mappedBy = "ingredients")
    List<MenuItem> items;
    boolean spicy;
    int inStock;
    boolean glutenFree;

    private Ingredient() {}

    public Ingredient(Long name, boolean spicy, int inStock, boolean glutenFree, List<MenuItem> items){
        this.name = name;
        this.spicy = spicy;
        this.inStock = inStock;
        this.glutenFree = glutenFree;
        this.items = new ArrayList<>(items);
    }
}
