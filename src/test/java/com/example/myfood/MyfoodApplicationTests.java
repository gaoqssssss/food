package com.example.myfood;

import com.example.myfood.dao.FoodDao;
import com.example.myfood.dao.FoodOtherDao;
import com.example.myfood.dao.UserDao;
import com.example.myfood.entity.Food;
import com.example.myfood.entity.FoodOther;
import com.example.myfood.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MyfoodApplicationTests {
@Autowired
private UserDao userDao;
@Autowired
private FoodDao foodDao;
@Autowired
private FoodOtherDao foodOtherDao;

    @Test
    public void getUsers() {
        List<User> users = userDao.selectUsers();
        users.forEach(System.out::println);
    }

    @Test
    public void getFoods() {
        List<Food> foods = foodDao.selectFoods();
        foods.forEach(System.out::println);
    }

    @Test
    public void getFoodOther(){
        List<FoodOther> foodOthers = foodOtherDao.selectFoodOthers();
        foodOthers.forEach(System.out::println);
    }

}
