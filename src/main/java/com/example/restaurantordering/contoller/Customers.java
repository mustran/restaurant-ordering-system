package com.example.restaurantordering.contoller;

import com.example.restaurantordering.models.Customer;
import com.example.restaurantordering.security.jwt.JwtTokenProvider;
import com.example.restaurantordering.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/customers", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
public class Customers {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Autowired
    CustomerService usersService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer create(@RequestParam("username") String username,
                           @RequestParam("password") String password) {

        return this.usersService.create(username, password);
    }
}
