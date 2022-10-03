package com.spring.booking.service;

import org.springframework.data.domain.Page;

import com.spring.booking.dto.RoomsDto;

/**
 * RoomsService
 */
public interface RoomsService {

    /**
     * Get all room and pagination <br>
     *
     * @param page page number
     * @param size page size
     * @return {@link Page<RoomsDto>}
     */
    Page<RoomsDto> getRooms(int id, int page, int size);
}
