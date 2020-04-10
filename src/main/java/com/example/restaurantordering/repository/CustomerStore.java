package com.example.restaurantordering.repository;

import com.example.restaurantordering.models.Customer;

import java.util.Optional;

public interface CustomerStore{
    Optional<Customer> getUserByUsername(String username);

    Customer create(String username, String password);
}
