package com.spring.booking.entity.identity;

import javax.persistence.Column;
import javax.persistence.Id;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class HotelsIdentity implements Serializable {

    private Integer id;
    private Integer userId;
}
