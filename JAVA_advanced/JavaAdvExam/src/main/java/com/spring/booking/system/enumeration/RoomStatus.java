package com.spring.booking.system.enumeration;

public enum RoomStatus implements CodeEnum<RoomStatus>{
    AVAILABLE("1"),
    BOOKED("2");

    /** Enum getter */
    @lombok.Getter
    private String value;

    /** Constructor */
    private RoomStatus(final String value) {
        this.value = value;
    }
}
