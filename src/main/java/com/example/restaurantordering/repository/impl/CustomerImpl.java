package com.example.restaurantordering.repository.impl;

import com.example.restaurantordering.models.Customer;
import com.example.restaurantordering.repository.CustomerStore;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@AllArgsConstructor
@Repository
public class CustomerImpl implements CustomerStore {

    private JpaCustomerStore store;

    @Override
    public Optional<Customer> getUserByUsername(String username) {
        return store.findById(username);
    }

    @Override
    public Customer create(String username, String password) {
        return store.save(new Customer(username, password));
    }
}
