package com.spring.booking.system.exception;

/**
 * ConvertNumberException
 */
public class ConvertNumberException extends RuntimeException{
    /**
     * Exception will throw if string can not convert to number
     *
     * @param message message error
     */
    public ConvertNumberException(String message){
        super(message);
    }
}
