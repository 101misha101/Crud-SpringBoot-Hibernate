package ru.kremlev.crudSpringBoot.dao;



import ru.kremlev.crudSpringBoot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUserList();

    void saveUser(User user);

    User getUser(int id);

    void removeUser(int id);
}
