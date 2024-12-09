package io.leogenus.grape.common.enums;

/**
 * Enumeration representing different property types used in the render engine.
 * This enum defines various data types that can be used for properties in the system.
 */
public enum PropType {
    /** Represents a boolean value (true/false) */
    Boolean,
    /** Represents a numeric value */
    Numeric,
    /** Represents an integer value */
    Integer,
    /** Represents a long integer value */
    Long,
    /** Represents a floating-point number */
    Float,
    /** Represents a double-precision floating-point number */
    Double,
    /** Represents a text string */
    String,
    /** Represents a text based UUID */
    UUID,
    /** Represents a timestamp or datetime value */
    Timestamp,
    /** Represents an array or collection of values */
    Array,
    /** Represents a custom-defined type */
    Custom,
    /** Represents a file type */
    File,
    /** Represents an unknown or undefined type */
    Unknown;

    /**
     * Converts a string representation to its corresponding PropType enum value.
     *
     * @param type The string representation of the property type
     * @return The corresponding PropType enum value, or null if the conversion fails
     */
    public static PropType of(String type) {
        try {
            return PropType.valueOf(type);
        } catch (Exception ignore) {
        }
        return null;
    }
}
