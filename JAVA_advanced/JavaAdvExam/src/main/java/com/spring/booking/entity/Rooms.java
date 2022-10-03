package com.spring.booking.entity;

import javax.persistence.*;

import com.spring.booking.entity.identity.RoomsIdentity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rooms")
@IdClass(RoomsIdentity.class)
public class Rooms {

    @Id
    @Column(name = "id")
    private Integer id;

    @Id
    @Column(name = "hotel_id")
    private Integer hotelId;

    @Column(name = "room_type")
    private String roomType;

    @Column(name = "price")
    private Float price;

    @Column(name = "images")
    private String images;

    @Column(name = "status")
    private String status;

    @Column(name = "created_ad")
    private java.time.LocalDate createdAd;

    @Column(name = "updated_at")
    private java.time.LocalDate updatedAt;

    @Column(name = "deleted_at")
    private java.time.LocalDate deletedAt;

    @Column(name = "service")
    private String service;

}
