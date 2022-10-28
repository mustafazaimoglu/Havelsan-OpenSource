package io.github.mustafazaimoglu.RestAPI.business.concretes;

import io.github.mustafazaimoglu.RestAPI.business.abstracts.UserService;
import io.github.mustafazaimoglu.RestAPI.dataAccess.concretes.UserDao;
import io.github.mustafazaimoglu.RestAPI.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public List<User> getAllSortedBySalaryDesc() {
        return userDao.getAllSortedBySalaryDesc();
    }

    @Override
    public List<User> getAllSortedBySalaryAsc() {
        return userDao.getAllSortedBySalaryAsc();
    }

    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    public String add(User user) {
        return userDao.add(user);
    }
}
