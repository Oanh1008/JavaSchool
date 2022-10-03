package com.spring.booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.booking.dto.LoginDto;
import com.spring.booking.system.constants.Endpoint;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * HomePageController
 */
@Controller
@RequestMapping(Endpoint.RQ)
@AllArgsConstructor
@Log4j2
public class CommonController {

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/login")
    public String login(Model model) {
        LoginDto loginDto = new LoginDto();
        model.addAttribute("login", loginDto);
        return "login";
    }

    @PostMapping("/login/handle")
    public String loginHandle(@ModelAttribute("login") LoginDto loginDto) {
        log.info(loginDto);
        return "redirect:/booing247/home";
    }

}
