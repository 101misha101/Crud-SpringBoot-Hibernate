package ru.kremlev.crudSpringBoot.service;



import ru.kremlev.crudSpringBoot.model.User;

import java.util.List;


public interface UserService {
    List<User> getUserList();

    void saveUser(User user);

    User getUser(int id);

    void removeUser(int id);

}
