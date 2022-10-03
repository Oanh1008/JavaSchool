package com.spring.booking.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.booking.entity.Rooms;
import com.spring.booking.entity.identity.RoomsIdentity;

public interface RoomsRepository extends JpaRepository<Rooms, RoomsIdentity> {


    @Query("select r from Rooms r where r.hotelId = ?1")
    Page<Rooms> findAllByHotelId(int id, Pageable page);
}
