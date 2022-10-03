package com.spring.booking.entity.identity;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class RoomsIdentity implements Serializable {

    private Integer id;
    private Integer hotelId;
}
