package com.spring.booking.entity.identity;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class ReviewsIdentity implements Serializable {

    private Integer id;
    private Integer userId;
    private Integer hotelId;
}
