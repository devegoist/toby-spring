package com.devegoist.spring.dao;

import java.sql.Connection;

/**
 * @author kim, eun soo - devegoist
 * @date 2019/12/17
 */
public interface ConnectionMaker {
    Connection makeConnection() throws Exception;
}
