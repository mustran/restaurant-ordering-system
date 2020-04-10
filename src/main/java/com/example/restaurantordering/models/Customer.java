package com.example.restaurantordering.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
public class Customer implements UserDetails {
    @Id
    String username;
    String password;
    String name;
    String surname;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "orderedBy")
    List<Order> orders;

    @OneToOne(fetch = FetchType.EAGER)
    Address address;

    List<String> roles;

    private Customer() {}

    private Customer(String username, String password, String name, String surname, Address address, List<Order> orders, List<String> roles) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.orders = new ArrayList<>(orders);
        this.roles = new ArrayList<>(roles);
    }

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
