package com.example.restaurantordering.repository.impl;

import com.example.restaurantordering.models.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaIngredientStore extends JpaRepository<Ingredient, String> {
}
