package com.example.restaurantordering.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Entity
public class Category {
    @Id
    String name;

    @OneToMany
    List<MenuItem> items;

    private Category(){}

    public Category(String name, List<MenuItem> items){
        this.name = name;
        this.items = new ArrayList<>(items);
    }
}
