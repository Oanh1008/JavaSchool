package com.spring.booking.system.enumeration;

import java.util.Arrays;
import java.util.Objects;

/**
 * The interface for CodeEnum class.
 */
public interface CodeEnum<E extends Enum<E>> {

    /**
     * Get value
     */
    String getValue();

    /**
     * Compare enum value with input
     *
     * @param input the input
     * @return the boolean
     */
    public default boolean is(final Object input) {
        return Objects.equals(getValue(), input);
    }

    /**
     * To enum
     *
     * @return the Enum class
     */
    public default E toEnum() {
        return (E) this;
    }

    /**
     * Returns the enumeration of the specified code value of the Enum that implements the specified CodeEnum.
     *
     * @param clazz the clazz
     * @param value the value
     * @param <E>   the class
     * @return the Enum class
     */
    public static <E extends Enum<E>> E of(Class<? extends CodeEnum<E>> clazz, String value) {
        return Arrays.stream(clazz.getEnumConstants()) //
                .filter(e -> Objects.equals(e.getValue(), value)) //
                .map(CodeEnum::toEnum) //
                .findFirst() //
                .orElse(null);
    }

    /**
     * Check if the value of String is the value of Enum.
     *
     * @param clazz the clazz
     * @param value the value
     * @return the boolean
     */
    public static boolean anyMatch(Class<? extends CodeEnum<?>> clazz, String value) {
        return Arrays.stream(clazz.getEnumConstants())
                .anyMatch(e -> e.getValue().equals(value));
    }

}
