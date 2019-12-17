package com.devegoist.spring.dao;

/**
 * @author kim, eun soo - devegoist
 * @date 2019/12/17
 */
public class MessageDao {
    private ConnectionMaker connectionMaker;

    public MessageDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
}
