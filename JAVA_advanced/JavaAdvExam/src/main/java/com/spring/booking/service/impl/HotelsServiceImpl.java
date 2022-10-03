package com.spring.booking.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.spring.booking.dto.HotelsDto;
import com.spring.booking.dto.StarDto;
import com.spring.booking.entity.Hotels;
import com.spring.booking.hold_data.IStar;
import com.spring.booking.repository.HotelsRepository;
import com.spring.booking.repository.ReviewsRepository;
import com.spring.booking.service.HotelsService;
import com.spring.booking.system.constants.NumberConstant;
import com.spring.booking.system.exception.ConvertNumberException;
import com.spring.booking.system.utils.BeanUtil;
import com.spring.booking.system.utils.NumberUtil;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * HotelsServiceImpl
 */
@Service
@AllArgsConstructor
@Log4j2
public class HotelsServiceImpl implements HotelsService {

    private ReviewsRepository reviewsRepository;

    private HotelsRepository hotelsRepository;

    @Override
    public List<HotelsDto> findAll() {
        return hotelsRepository.findAll()
                .stream()
                .map(h -> BeanUtil.createCopy(h, HotelsDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public int getPage(int page) {
        if (page > NumberConstant.ZERO) {
            return page - NumberConstant.ONE;
        }
        return NumberConstant.ZERO;
    }

    @Override
    public Map<Integer, Integer> getStar() {
        List<IStar> stars = reviewsRepository.getAllStar();
        List<StarDto> starsL = stars
                .stream()
                .map(StarDto::new)
                .collect(Collectors.toList());
        Map<Integer, Integer> starMap = new LinkedHashMap<>();
        starsL.forEach(s -> starMap.put(s.getHotelId(), s.getStar()));
        return starMap;
    }

    @Override
    public List<HotelsDto> getListHotelsDto() {
        Map<Integer, Integer> starMap = getStar();
        List<HotelsDto> hotelsDtos = findAll();
        hotelsDtos.forEach(ht -> ht.setStar(starMap.get(ht.getId())));
        return hotelsDtos;
    }

    @Override
    public List<HotelsDto> getListTop3() {
        List<HotelsDto> hotelsDtos3 = new ArrayList<>();
        List<HotelsDto> hotelsDtos = getListHotelsDto();
        int flag = NumberConstant.ZERO;
        for (Integer id : getStar().keySet()) {
            for (HotelsDto hotelsDto : hotelsDtos) {
                if (id.equals(hotelsDto.getId())) {
                    hotelsDtos3.add(hotelsDto);
                }
            }
            if (++flag == NumberConstant.THREE) {
                break;
            }
        }
        return hotelsDtos3;
    }

    @Override
    public List<HotelsDto> searchByCondition(String address, String price) throws ConvertNumberException {
        List<HotelsDto> resultSearch;
        List<HotelsDto> hotelsDtos = getListHotelsDto();
        Float priceF = NumberUtil.stringToFloat(price);
        if (!ObjectUtils.isEmpty(address) && ObjectUtils.isEmpty(priceF)) {
            resultSearch = search(hotelsDtos, t -> formatToSearch(t.getAddress()).contains(formatToSearch(address)));
        } else if (ObjectUtils.isEmpty(address) && !ObjectUtils.isEmpty(priceF)) {
            resultSearch = search(hotelsDtos, h -> h.getPriceFrom() <= priceF && h.getPriceTo() >= priceF);
        } else {
            resultSearch = search(hotelsDtos, h -> formatToSearch(h.getAddress()).contains(formatToSearch(address))
                    && h.getPriceFrom() <= priceF && h.getPriceTo() >= priceF);
        }
        return resultSearch;
    }


    @Override
    public List<HotelsDto> search(List<HotelsDto> hotelsDtos, Predicate<HotelsDto> predicate) {
        return hotelsDtos.stream().filter(h -> predicate.test(h)).collect(Collectors.toList());
    }

    @Override
    public String formatToSearch(String value) {
        return value.toLowerCase().trim();
    }

    @Override
    public HotelsDto findById(int id) {
        Optional<Hotels> hotelsDto = hotelsRepository.findById(id);
        if (hotelsDto.isEmpty()) {
            return new HotelsDto();
        }
        return BeanUtil.createCopy(hotelsDto.get(), HotelsDto.class);
    }
}
