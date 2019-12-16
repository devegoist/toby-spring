package com.devegoist.spring.dao;

/**
 * @author kim, eun soo - devegoist
 * @date 2019/12/17
 */
public class UserDaoTest {
    public static void main(String[] args) throws Exception {
        ConnectionMaker connectionMaker = new DConnectionMaker();

        UserDao dao = new UserDao(connectionMaker);
    }
}
