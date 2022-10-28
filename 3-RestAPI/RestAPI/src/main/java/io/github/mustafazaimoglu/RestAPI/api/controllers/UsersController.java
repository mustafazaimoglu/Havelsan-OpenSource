package io.github.mustafazaimoglu.RestAPI.api.controllers;

import io.github.mustafazaimoglu.RestAPI.business.abstracts.UserService;
import io.github.mustafazaimoglu.RestAPI.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/users/")
public class UsersController {
    @Autowired
    UserService userService;

    @GetMapping("getAll")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("getAllSortedBySalaryDesc")
    public List<User> getAllSortedBySalaryDesc(){
        return userService.getAllSortedBySalaryDesc();
    }

    @GetMapping("getAllSortedBySalaryAsc")
    public List<User> getAllSortedBySalaryAsc(){
        return userService.getAllSortedBySalaryAsc();
    }

    @GetMapping("getById")
    public User getById(@RequestParam int id){
        return userService.getById(id);
    }

    @PostMapping("add")
    public String add(@RequestBody User user){
        return userService.add(user);
    }

}
