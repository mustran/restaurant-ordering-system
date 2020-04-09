package com.example.restaurantordering.repository.impl;

import com.example.restaurantordering.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaOrderStore extends JpaRepository<Order, Long> {
}
