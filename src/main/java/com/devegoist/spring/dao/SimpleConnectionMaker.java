package com.devegoist.spring.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author kim, eun soo - devegoist
 * @date 2019/12/17
 */
public class SimpleConnectionMaker {
    public Connection makeNewConnection() throws Exception {
        Class.forName("org.h2.Driver");
        Connection c = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
        return c;
    }
}
