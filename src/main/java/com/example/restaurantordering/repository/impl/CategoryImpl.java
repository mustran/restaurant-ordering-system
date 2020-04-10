package com.example.restaurantordering.repository.impl;

import com.example.restaurantordering.models.Category;
import com.example.restaurantordering.repository.CategoryStore;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor
@Repository
public class CategoryImpl implements CategoryStore {

    private JpaCategoryStore store;

    @Override
    public List<Category> getAll() {
        return store.findAll();
    }
}
