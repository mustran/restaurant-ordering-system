package com.example.restaurantordering.repository.impl;

import com.example.restaurantordering.models.Quantity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaQuantityStore extends JpaRepository<Quantity, Long> {
}
