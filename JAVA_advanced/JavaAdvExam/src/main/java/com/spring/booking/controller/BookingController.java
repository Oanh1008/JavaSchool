package com.spring.booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.booking.system.constants.AppConstant;

@Controller
@RequestMapping("/booking247/book")
public class BookingController {

    @GetMapping("")
    public String xoa(){
        return "register";
    }
}
