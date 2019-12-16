package com.devegoist.spring.dao;

import java.sql.Connection;

/**
 * @author kim, eun soo - devegoist
 * @date 2019/12/17
 */
public class NUserDao extends UserDao {
    @Override
    public Connection getConnection() throws Exception {
        return null;
    }
}
