package com.example.restaurantordering.contoller;

import com.example.restaurantordering.security.jwt.JwtTokenProvider;
import com.example.restaurantordering.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/addresses", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
public class Addresses {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Autowired
    AddressService addressService;



}
