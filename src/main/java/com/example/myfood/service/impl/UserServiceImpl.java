package com.example.myfood.service.impl;

import com.example.myfood.dao.UserDao;
import com.example.myfood.entity.ResultVO;
import com.example.myfood.entity.User;
import com.example.myfood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryUsers() {
        return userDao.selectUsers();
    }

    @Override
    public int queryUserById(Integer userId) {
        return userDao.selectUserByPrimaryKey(userId);
    }

//    @Override
//    public ResultVO login(String userName, String password) {
//        User user = userDao.findUserByUserName(userName);
//        ResultVO resultVO = new ResultVO();
//        if (user != null){
//            if (user.getUserName().equals(userName)
//                    &&user.getPassword().equals(password)){
//                resultVO.setMessage("登录成功");
//            }else resultVO.setMessage("登录失败");
//        }
//        else resultVO.setMessage("用户不存在");
//        return null;
//    }

}
