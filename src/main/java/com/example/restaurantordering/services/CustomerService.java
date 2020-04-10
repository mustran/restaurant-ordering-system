package com.example.restaurantordering.services;

import com.example.restaurantordering.models.Customer;

public interface CustomerService {
    Customer create(String username, String password);
}
