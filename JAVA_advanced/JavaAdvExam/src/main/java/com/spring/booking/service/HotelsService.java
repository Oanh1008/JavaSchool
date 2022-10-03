package com.spring.booking.service;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import com.spring.booking.dto.HotelsDto;
import com.spring.booking.system.exception.ConvertNumberException;

/**
 * HotelsService
 */
public interface HotelsService {

    /**
     * Get all hotel and pagination
     *
     * @return Page of HotelsDto
     */
    List<HotelsDto> findAll();

    /**
     * Get page now
     *
     * @param page
     * @return number of page now
     */
    int getPage(int page);

    /**
     * Get star for hotel
     *
     * @return Map with key hotelId and value is number of star
     */
    Map<Integer, Integer> getStar();

    List<HotelsDto> getListHotelsDto();

    List<HotelsDto> getListTop3();

    List<HotelsDto> searchByCondition(String address, String price) throws ConvertNumberException;

    List<HotelsDto> search(List<HotelsDto> hotelsDtos, Predicate<HotelsDto> predicate);

    String formatToSearch(String value);

    HotelsDto findById(int id);
}
