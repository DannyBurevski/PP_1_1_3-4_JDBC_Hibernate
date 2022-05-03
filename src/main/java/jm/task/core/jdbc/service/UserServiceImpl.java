package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl usDao = new UserDaoJDBCImpl();


    public void createUsersTable() {
    usDao.createUsersTable();
    }

    public void dropUsersTable() {
        usDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        usDao.saveUser(name, lastName, age);
        System.out.println("User с именем – " + name + " добавлен в базу данных");
    }

    public void removeUserById(long id) {
        usDao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return usDao.getAllUsers();
    }

    public void cleanUsersTable() {
        usDao.cleanUsersTable();
    }
}
