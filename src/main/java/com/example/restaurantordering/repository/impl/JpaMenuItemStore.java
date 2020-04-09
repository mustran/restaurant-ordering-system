package com.example.restaurantordering.repository.impl;

import com.example.restaurantordering.models.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMenuItemStore extends JpaRepository<MenuItem, String> {
}
