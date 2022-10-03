package com.spring.booking.system.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.log4j.Log4j2;

/**
 * BeanUtil
 */
@Log4j2
public class BeanUtil {

    private BeanUtil() {}

    /**
     * Convert S class to T class
     *
     * @param oSrc source object
     * @param type target class
     * @return
     */
    public static <T, S> T createCopy(S oSrc, Class<T> type) {
        try {
            T copy = type.getDeclaredConstructor().newInstance();
            org.springframework.beans.BeanUtils.copyProperties(oSrc, copy);
            return copy;
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException |
                 InvocationTargetException | NoSuchMethodException | SecurityException e) {
            log.catching(e);
        }
        return null;
    }

    /**
     * Mapping a list of S to list of T
     *
     * @param oSrc Object source
     * @param type Class target
     * @return List of T
     */
    public static <T, S> List<T> createCopy(List<S> oSrc, Class<T> type) {
        return oSrc.stream().map(o -> createCopy(o, type)).collect(Collectors.toList());
    }

}
