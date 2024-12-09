package io.leogenus.grape.common.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum representing different types of commands.
 */
public enum CommandType {
    /**
     * Command to restart selected application.
     */
    RESTART,

    ;

    /**
     * Converts a string value to a CommandType.
     * 
     * @param value the string representation of the command type
     * @return the corresponding CommandType
     * @throws IllegalArgumentException if the specified value is not a valid command type
     */
    @JsonCreator
    public static CommandType fromValue(String value) {
        return CommandType.valueOf(value.toUpperCase());
    }

    /**
     * Converts the CommandType to its string representation.
     * 
     * @return the string representation of the command type
     */
    @JsonValue
    public String toValue() {
        return this.name().toLowerCase();
    }
}
