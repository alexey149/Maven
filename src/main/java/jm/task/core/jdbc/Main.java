package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Vasya", "Petrov", (byte) 22);
        userDao.saveUser("Kolya", "Ivanov", (byte) 22);
        userDao.saveUser("Bob", "Jonsn", (byte) 22);
        userDao.saveUser("Sara", "Conor", (byte) 22);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
