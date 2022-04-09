package com.example.myfood.service;

import com.example.myfood.entity.ResultVO;
import com.example.myfood.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> queryUsers();
    int queryUserById(Integer userId);
//    ResultVO login(String userName, String password);
}
