package com.spring.booking.entity;

import javax.persistence.*;

import com.spring.booking.entity.identity.ReviewsIdentity;

@Entity
@Table(name = "reviews")
@IdClass(ReviewsIdentity.class)
public class Reviews {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "rate")
    private Byte rate;

    @Column(name = "content")
    private String content;

    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Id
    @Column(name = "hotel_id")
    private Integer hotelId;

    @Column(name = "created_at")
    private java.time.LocalDate createdAt;

    @Column(name = "updated_at")
    private java.time.LocalDate updatedAt;

}
