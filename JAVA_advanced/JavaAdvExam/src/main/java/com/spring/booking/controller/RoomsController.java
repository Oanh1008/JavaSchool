package com.spring.booking.controller;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.booking.dto.RoomsDto;
import com.spring.booking.service.CommonService;
import com.spring.booking.service.HotelsService;
import com.spring.booking.service.RoomsService;
import com.spring.booking.system.constants.AppConstant;
import com.spring.booking.system.constants.Endpoint;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * RoomsController
 */
@Controller
@RequestMapping(Endpoint.RQ)
@AllArgsConstructor
@Log4j2
public class RoomsController {

    private RoomsService roomsService;

    private CommonService commonService;

    private HotelsService hotelsService;

    /**
     * Go to hotel detail by id page
     *
     * @param id id of hotel
     * @return hotel detail by id page
     */
    @GetMapping(Endpoint.HOTEL_DETAILS_ID)
    public String getDetailsHotel(@PathVariable(AppConstant.ID) Integer id,
                                  @RequestParam(value = AppConstant.PAGE, defaultValue = AppConstant.ZERO) Integer page,
                                  @RequestParam(value = AppConstant.SIZE, defaultValue = AppConstant.SIX) Integer size,
                                  Model model) {
        /** Get data */
        Page<RoomsDto> roomsDtos = roomsService.getRooms(id,commonService.getPage(page), size);

        /** Transfer data for hotel_details */
        model.addAttribute(AppConstant.ROOMS, roomsDtos.getContent());
        model.addAttribute(AppConstant.TOTAL_PAGE,commonService.getTotalPages(roomsDtos.getTotalPages()));
        model.addAttribute(AppConstant.ID,id);
        model.addAttribute(AppConstant.HOTEL, hotelsService.findById(id));

        return AppConstant.HOTEL_DETAILS;
    }


}
