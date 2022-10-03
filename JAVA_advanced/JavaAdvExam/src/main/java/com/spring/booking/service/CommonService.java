package com.spring.booking.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import com.spring.booking.system.constants.NumberConstant;

/**
 * CommonService
 */
@Service
public class CommonService {

    /**
     * Get page number <br>
     * if page = 0 => return 0 <br>
     * if page > 0 => return page -1
     *
     * @param page page number
     * @return page number
     */
    public int getPage(int page) {
        return page > NumberConstant.ZERO ? page - NumberConstant.ONE : page;
    }

    /**
     * Get list of total page <br>
     * Example: pages = 9 <br>
     * => return List.as(1,2,3,4,5,6,7,8,9)
     *
     * @param pages
     * @return List of pages
     */
    public List<Integer> getTotalPages(int pages){
        return IntStream.rangeClosed(NumberConstant.ONE,pages).boxed().collect(Collectors.toList());
    }
}
