package com.spring.booking.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginDto {

    @NotBlank(message = "Email is required")
    @Email(message = "Not format email")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;
}
