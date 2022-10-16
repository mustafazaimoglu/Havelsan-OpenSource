package io.github.mustafazaimoglu.RestAPI.business.abstracts;

import io.github.mustafazaimoglu.RestAPI.entities.User;

import java.util.List;

public interface UserService {
    public List<User> getAll();

    public User getById(int id);

    public String add(User user);
}
