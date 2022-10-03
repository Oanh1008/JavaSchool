package com.spring.booking.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.spring.booking.dto.RoomsDto;
import com.spring.booking.repository.RoomsRepository;
import com.spring.booking.service.RoomsService;
import com.spring.booking.system.enumeration.CodeEnum;
import com.spring.booking.system.enumeration.RoomStatus;
import com.spring.booking.system.enumeration.RoomType;
import com.spring.booking.system.utils.BeanUtil;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RoomsServiceImpl implements RoomsService {

    private RoomsRepository roomsRepository;

    /**
     * Get all room and pagination
     *
     * @param page page number
     * @param size size of page
     * @return {@link Page<RoomsDto>}
     */
    @Override
    public Page<RoomsDto> getRooms(int id, int page, int size) {
        Page<RoomsDto> roomsDtoPage = roomsRepository.findAllByHotelId(id, PageRequest.of(page, size, Sort.by("price")))
                .map(t -> BeanUtil.createCopy(t, RoomsDto.class));
        roomsDtoPage.getContent().forEach(r -> {
            r.setRoomStatusE(CodeEnum.of(RoomStatus.class, r.getStatus()));
            r.setRoomTypeE(CodeEnum.of(RoomType.class, r.getRoomType()));
        });
        return roomsDtoPage;
    }
}
