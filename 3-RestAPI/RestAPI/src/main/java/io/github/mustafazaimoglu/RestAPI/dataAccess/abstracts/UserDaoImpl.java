package io.github.mustafazaimoglu.RestAPI.dataAccess.abstracts;

import io.github.mustafazaimoglu.RestAPI.entities.User;

import java.util.List;

public interface UserDaoImpl {
    public List<User> getAll();

    public User getById(int id);

    public String add(User user);
}
