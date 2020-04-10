package com.example.restaurantordering.repository;

import com.example.restaurantordering.models.Category;

import java.util.List;

public interface CategoryStore {

    List<Category> getAll();
}
