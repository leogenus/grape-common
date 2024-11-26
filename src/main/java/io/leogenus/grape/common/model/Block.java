package io.leogenus.grape.common.model;

import com.fasterxml.jackson.databind.JsonNode;
import io.leogenus.grape.common.enums.BlockType;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * Represents a block component in the render engine.
 * A block is a fundamental unit that can be part of a larger structure,
 * containing information about its identity, relationship, type, and additional details.
 */
@Getter
@Setter
public class Block {
    /**
     * Unique identifier for the block
     */
    private String id;

    /**
     * Identifier of the parent block, establishing hierarchical relationships
     */
    private String parentId;

    /**
     * Identifier of the next block in chain.
     */
    private String nextId;

    /**
     * Type of the block, defined by {@link BlockType} enum
     */
    private BlockType type;

    /**
     * Additional details stored as key-value pairs, where values are JSON nodes
     * allowing for flexible and dynamic data storage
     */
    private Map<String, JsonNode> details;
}