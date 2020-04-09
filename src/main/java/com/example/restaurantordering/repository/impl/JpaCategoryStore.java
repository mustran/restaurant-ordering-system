package com.example.restaurantordering.repository.impl;

import com.example.restaurantordering.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCategoryStore extends JpaRepository<Category, String> {
}
