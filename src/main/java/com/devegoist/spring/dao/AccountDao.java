package com.devegoist.spring.dao;

/**
 * @author kim, eun soo - devegoist
 * @date 2019/12/17
 */
public class AccountDao {
    private ConnectionMaker connectionMaker;

    public AccountDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
}
