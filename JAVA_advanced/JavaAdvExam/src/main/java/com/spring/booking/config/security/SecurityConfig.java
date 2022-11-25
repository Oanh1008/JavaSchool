package com.spring.booking.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@EnableWebSecurity
//@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    public static final String[] ACCEPT = {
//            "/booking247/home",
//            "/booking247/hotel/detail/**",
//            "/booking247/home/search/**",
//            "/booking247/register",
//            "/booking247/login"
//    };
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .authorizeRequests()
//                .antMatchers( "/booking247/home").permitAll()
//                .anyRequest()
//                .authenticated().and().formLogin().loginPage("/booking247/login")
//                .loginProcessingUrl("/booking247/login").permitAll().isCustomLoginPage();
//    }
}
