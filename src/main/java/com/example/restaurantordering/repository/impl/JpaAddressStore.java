package com.example.restaurantordering.repository.impl;

import com.example.restaurantordering.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaAddressStore extends JpaRepository<Address, Long> {
}
