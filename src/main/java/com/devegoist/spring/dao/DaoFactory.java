package com.devegoist.spring.dao;

/**
 * @author kim, eun soo - devegoist
 * @date 2019/12/17
 */
public class DaoFactory {
    public UserDao userDao() {
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao userDao = new UserDao(connectionMaker);
        return userDao;
    }
}
