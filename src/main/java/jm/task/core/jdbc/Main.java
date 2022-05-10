package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService us = new UserServiceImpl();
        us.createUsersTable();
        us.saveUser("David", "Beckham", (byte) 47);
        us.saveUser("Roberto", "Carlos", (byte) 49);
        us.saveUser("Edgar", "Davids", (byte) 49);
        us.saveUser("Wesley", "Sneijder", (byte) 37);
        us.removeUserById(2);
        us.getAllUsers();
        us.cleanUsersTable();
        us.dropUsersTable();

        Util.closeSessionFactory();
    }
}
