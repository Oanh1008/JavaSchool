package com.spring.booking.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.booking.dto.HotelsDto;
import com.spring.booking.entity.Hotels;

/**
 * HotelsRepository
 */
public interface HotelsRepository extends JpaRepository<Hotels, Integer> {

    /**
     * Get all Hotels from data
     *
     * @return List of Hotels
     */
    List<Hotels> findAll();

    @Query("select h from Hotels h where h.id = ?1")
    Optional<Hotels> findById(int id);
}
