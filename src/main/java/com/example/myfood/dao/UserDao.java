package com.example.myfood.dao;

import com.example.myfood.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    int selectUserByPrimaryKey(Integer userId);
    List<User> selectUsers();
    User findUserByUserName(String userName);
}
