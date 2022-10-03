package com.spring.booking.dto;

import com.spring.booking.system.enumeration.RoomStatus;
import com.spring.booking.system.enumeration.RoomType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * RoomsDto
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomsDto {
    private Integer id;
    private Integer hotelId;
    private String roomType;
    private Float price;
    private String images;
    private String status;
    private RoomType roomTypeE;
    private RoomStatus roomStatusE;
}
