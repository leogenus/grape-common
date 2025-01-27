package io.leogenus.grape.common.enums;

/**
 * The class that contains additional details specific to this block type.
 */
public enum BlockType {


    /**
     * Represents a block that handles return values or statements.
     */
    RETURN_BLOCK,

    /**
     * Represents a block that handles throw exceptions.
     */
    THROW_BLOCK,

    /**
     * Represents a block that handles try...catch exceptions.
     */
    TRY_CATCH_BLOCK,

    /**
     * Represents a block for variable declarations.
     */
    DECLARE_BLOCK,

    /**
     * Represents a conditional (if) block.
     */
    IF_CONDITION,

    /**
     * Represents a block for defining database queries.
     */
    QUERY_BLOCK,

    /**
     * Represents a block for executing database queries.
     */
    QUERY_EXECUTE_BLOCK,

    /**
     * Represents a block for saving a file in fileSystem.
     */
    FILE_SAVE_BLOCK,

    /**
     * Represents a block for reading a file from fileSystem.
     */
    FILE_READ_BLOCK,

    /**
     * Represents a block for requesting to other urls
     */
    HTTP_EXECUTE_BLOCK,

    /**
     * Represents a block for calling to another methods
     */
    METHOD_CALL_BLOCK,

    /**
     * Represents a block for exporting data into formats: csv, excel, json or some other types
     */
    EXPORT_BLOCK,

    /**
     * Represents a block for importing data from formats: csv, excel, json or some other types
     */
    IMPORT_BLOCK,

    /**
     * Represents a block for managing users in openid like keycloak or other sso mechanism that configured in settings
     */
    OPENID_USER_BLOCK,

    /**
     * Represents a block for managing roles in openid like keycloak or other sso mechanism that configured in settings
     * and it manage two types: realm roles, client roles name access or permissions
     */
    OPENID_ROLE_BLOCK,

    /**
     * Represents a block for output the log data into flow
     */
    LOG_BLOCK,
    ;

}
