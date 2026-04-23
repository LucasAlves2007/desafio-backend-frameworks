package com.example.demo.service;

@Service
import com.example.demo.model.User;
import java.util.List;

public class UserService {

    public List<User> getUsers() {
        return List.of(new User("Lucas"));
    }
}