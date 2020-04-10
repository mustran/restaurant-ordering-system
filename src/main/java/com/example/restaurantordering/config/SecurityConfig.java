package com.example.restaurantordering.config;

import com.example.restaurantordering.security.jwt.JwtSecurityConfigurer;
import com.example.restaurantordering.security.jwt.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //@formatter:off
        http
                .httpBasic().disable()
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/customers").permitAll()
                .antMatchers(HttpMethod.GET, "/categories").permitAll()
                .antMatchers(HttpMethod.OPTIONS, "/events/new").permitAll()
                .antMatchers("*", "/events/{id}/buddiesforevent").permitAll()
                .antMatchers(HttpMethod.GET, "/users").permitAll()
                .antMatchers("*", "/events/{id}").permitAll()
                .antMatchers(HttpMethod.GET, "/events/{id}/**").permitAll()
                .antMatchers(HttpMethod.POST, "/users/register").permitAll()
                .antMatchers(HttpMethod.POST, "/users/login").permitAll()
                .antMatchers(HttpMethod.GET, "/users/events").permitAll()
                .antMatchers(HttpMethod.GET, "/users/comments").permitAll()
                .antMatchers(HttpMethod.GET, "/users/buddiesforevents").permitAll()
                .antMatchers(HttpMethod.GET, "/buddiesforevents/{id}").permitAll()
                .antMatchers(HttpMethod.GET, "/buddiesforevents").permitAll()
                .antMatchers(HttpMethod.GET, "/buddiesforevents/{id}/comments").permitAll()
                .antMatchers(HttpMethod.GET, "/users/**").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .apply(new JwtSecurityConfigurer(jwtTokenProvider));
        //@formatter:on
    }

}
