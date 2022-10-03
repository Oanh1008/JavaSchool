package com.spring.booking.system.enumeration;

public enum RoomType implements CodeEnum<RoomType> {
    NORMAL("1"),
    BUSINESS("2");

    /** Enum getter */
    @lombok.Getter
    private String value;

    /** Constructor */
    private RoomType(final String value) {
        this.value = value;
    }
}
