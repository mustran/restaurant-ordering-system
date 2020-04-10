package com.example.restaurantordering.repository.impl;

import com.example.restaurantordering.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCustomerStore extends JpaRepository<Customer, String> {

}
