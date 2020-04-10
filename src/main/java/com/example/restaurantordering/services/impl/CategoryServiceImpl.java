package com.example.restaurantordering.services.impl;

import com.example.restaurantordering.models.Category;
import com.example.restaurantordering.repository.CategoryStore;
import com.example.restaurantordering.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryStore store;

    @Override
    public List<Category> getAll() {
        return store.getAll();
    }
}
