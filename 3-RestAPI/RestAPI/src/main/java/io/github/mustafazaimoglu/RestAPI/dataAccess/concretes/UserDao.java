package io.github.mustafazaimoglu.RestAPI.dataAccess.concretes;

import io.github.mustafazaimoglu.RestAPI.dataAccess.abstracts.UserDaoImpl;
import io.github.mustafazaimoglu.RestAPI.entities.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao implements UserDaoImpl {

    private final List<User> userList;

    public UserDao() {
        this.userList = new ArrayList<>();
        this.userList.add(new User(1,"Anas Ridho","RODIANSYAH","Lombok",32500));
        this.userList.add(new User(2,"Mustafa","ZAIMOGLU","Mersin",11000));
        this.userList.add(new User(3,"Yusuf","HAVUTLU","Adıyaman",13500));
        this.userList.add(new User(4,"Muhammed Can","EKER","Bitlis",8500));
        this.userList.add(new User(5,"Emre","YAVUZ","Diyarbakır",5000));
    }

    @Override
    public List<User> getAll() {
        return this.userList;
    }

    @Override
    public User getById(int id) {
        for (User u : this.userList){
            if (u.getUserId() == id) {
               return u;
            }
        }

        return null;
    }

    @Override
    public String add(User user) {
        this.userList.add(user);
        return "New User Added!";
    }


}
