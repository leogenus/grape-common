package io.leogenus.grape.common.enums;

/**
 * Enumeration of supported database types in the render engine.
 * This enum represents the various database management systems that can be used
 * with the application.
 * <p>
 * Supported databases:
 * <ul>
 *     <li>POSTGRESQL - PostgreSQL database</li>
 *     <li>CLICKHOUSE - ClickHouse analytical database</li>
 *     <li>ORACLE - Oracle database</li>
 *     <li>MYSQL - MySQL database</li>
 *     <li>SQLSERVER - Microsoft SQL Server</li>
 * </ul>
 */
public enum DatabaseType {

    /** 
     * PostgreSQL database system.
     * An open-source relational database that emphasizes extensibility 
     * and SQL compliance.
     */
    POSTGRESQL,

    /** 
     * ClickHouse database system.
     * An open-source column-oriented database management system 
     * designed for online analytical processing (OLAP).
     */
    CLICKHOUSE,

    /** 
     * Oracle database system.
     * A multi-model database management system developed by Oracle Corporation,
     * commonly used for running online transaction processing (OLTP).
     */
    ORACLE,

    /** 
     * MySQL database system.
     * An open-source relational database management system owned by Oracle Corporation,
     * known for its speed, reliability, and ease of use.
     */
    MYSQL,

    /** 
     * Microsoft SQL Server database system.
     * A relational database management system developed by Microsoft,
     * designed for enterprise environments.
     */
    SQLSERVER
}
