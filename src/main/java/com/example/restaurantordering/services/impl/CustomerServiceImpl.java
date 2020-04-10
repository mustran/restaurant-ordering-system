package com.example.restaurantordering.services.impl;

import com.example.restaurantordering.models.Customer;
import com.example.restaurantordering.repository.CustomerStore;
import com.example.restaurantordering.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerStore store;

    @Override
    public Customer create(String username, String password) {
        return store.create(username, password);
    }
}
