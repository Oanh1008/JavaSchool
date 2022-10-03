package com.spring.booking.dto;

import com.spring.booking.hold_data.IStar;
import com.spring.booking.system.constants.NumberConstant;
import com.spring.booking.system.utils.NumberUtil;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * StarDto
 */
@NoArgsConstructor
@Data
public class StarDto {

    private Integer hotelId;
    private int star;

    /**
     * Constructor <br>
     * Convert IStar to StarDto
     *
     * @param iStar
     */
    public StarDto(IStar iStar){
        this.hotelId = iStar.getId();
        this.star = NumberUtil.formatBigDecimal(iStar.getStar(), NumberConstant.ZERO).intValue();
    }
}
