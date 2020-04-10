package com.example.restaurantordering.services.impl;

import com.example.restaurantordering.repository.AddressStore;
import com.example.restaurantordering.services.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AddressServiceImpl implements AddressService {

    private AddressStore addressStore;

}
