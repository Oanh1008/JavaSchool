package com.spring.booking.system.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.ObjectUtils;

import com.spring.booking.system.constants.AppConstant;
import com.spring.booking.system.constants.MessageConstant;
import com.spring.booking.system.exception.ConvertNumberException;

public class NumberUtil {

    private NumberUtil() {
    }

    /**
     * Format BigDecimal. <br>
     * This method is round input 2 places decimal and rounding down that value <br>
     * Example input is 2782.00921 <br>
     * Output is 2782.01
     *
     * @param input BigDecimal
     * @return BigDecimal
     */
    public static BigDecimal formatBigDecimal(BigDecimal input, int newScale) {
        if (ObjectUtils.isEmpty(input)) {
            return null;
        }
        return input.setScale(newScale, RoundingMode.HALF_EVEN);
    }

    /**
     * Convert a string to Float <br>
     * If value is null it will return null value <br>
     * If value is not match digit pattern , it will throw ConvertNumberException
     *
     * @param value
     * @return FLoat
     * @throws ConvertNumberException
     */
    public static Float stringToFloat(String value) throws ConvertNumberException {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        if (!value.matches(AppConstant.DIGIT_PATTERN)) {
            throw new ConvertNumberException(StringUtils.join(MessageConstant.CONVERT_FLOAT_EX, value));
        }
        return Float.parseFloat(value);
    }
}
