package com.spring.booking.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.booking.dto.HotelsDto;
import com.spring.booking.service.HotelsService;
import com.spring.booking.system.constants.AppConstant;
import com.spring.booking.system.constants.Endpoint;
import com.spring.booking.system.exception.ConvertNumberException;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * HomePageController
 */
@Controller
@RequestMapping(Endpoint.RQ)
@AllArgsConstructor
@Log4j2
public class HomePageController {

    private HotelsService hotelsService;

    /**
     * Get all hotels
     *
     * @return index page
     */
    @GetMapping(Endpoint.HOME)
    public String indexPage(Model model) {
        /** Get data */
        hotelsService.getStar();
        List<HotelsDto> hotels = hotelsService.getListHotelsDto();
        List<HotelsDto> hotels3 = hotelsService.getListTop3();

        /** Transfer data */
        model.addAttribute(AppConstant.HOTELS, hotels);
        model.addAttribute(AppConstant.HOTELS_3, hotels3);

        return AppConstant.INDEX;
    }

    /**
     * Go to about page
     *
     * @return about page
     */
    @GetMapping(Endpoint.ABOUT)
    public String aboutPage() {
        return AppConstant.ABOUT;
    }

    /**
     * Search by address or price or address and price
     *
     * @param address address
     * @param price price
     * @param model {@link Model}
     * @return hotel_search page
     */
    @GetMapping(Endpoint.HOTEL_SEARCH)
    public String searchHotel(@RequestParam(value = "address") String address,
                              @RequestParam(value = "price") String price,
                              Model model) throws ConvertNumberException{
        /** Get data */
        if (ObjectUtils.isEmpty(address) && ObjectUtils.isEmpty(price)) {
            return AppConstant.RD_HOME_PAGE;
        }
        List<HotelsDto> hotels = hotelsService.searchByCondition(address, price);
        /** Transfer data */
        model.addAttribute(AppConstant.HOTELS, hotels);

        return AppConstant.HOTEL_SEARCH;
    }

}
