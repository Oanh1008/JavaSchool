package com.spring.booking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.spring.booking.entity.identity.HotelsIdentity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "hotels")
@IdClass(HotelsIdentity.class)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Hotels {

    @Id
    @Column(name = "id")
    private Integer id;

    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "hotline")
    private String hotline;

    @Column(name = "description")
    private String description;

    @Column(name = "images")
    private String images;

    @Column(name = "hotel_status")
    private String hotelStatus;

    @Column(name = "created_at")
    private java.time.LocalDateTime createdAt;

    @Column(name = "updated_at")
    private java.time.LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private java.time.LocalDate deletedAt;

    @Column(name = "price_from")
    private Float priceFrom;

    @Column(name = "price_to")
    private Float priceTo;

}
