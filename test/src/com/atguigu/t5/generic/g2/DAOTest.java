package com.atguigu.t5.generic.g2;

import java.util.List;

/**
 * @author Wint
 * @create 2022-06-24 14:55
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("1",new User(1,10,"Tom"));
        userDAO.save("3",new User(3,10,"Jerry"));
        userDAO.save("2",new User(2,10,"Bob"));

        userDAO.update("2",new User(4,5,"John"));

        System.out.println(userDAO.get("2"));
        System.out.println("-----------------------");

        List<User> list = userDAO.list();
        for(User u : list){
            System.out.println(u);
        }
        System.out.println("------------------------");
        userDAO.delete("1");
        System.out.println(userDAO);
    }
}
