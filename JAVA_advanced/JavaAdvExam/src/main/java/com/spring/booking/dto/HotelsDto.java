package com.spring.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * HotelsDto
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelsDto {

    private Integer id;
    private Integer userId;
    private String name;
    private String address;
    private String hotline;
    private String description;
    private String images;
    private String hotelStatus;
    private Float priceFrom;
    private Float priceTo;
    private Integer star;
}
