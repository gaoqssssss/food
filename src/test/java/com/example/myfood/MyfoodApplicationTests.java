package com.example.myfood;

import com.example.myfood.dao.FoodDao;
import com.example.myfood.dao.FoodOtherDao;
import com.example.myfood.dao.FoodTypeDao;
import com.example.myfood.dao.UserDao;
import com.example.myfood.entity.Food;
import com.example.myfood.entity.FoodOther;
import com.example.myfood.entity.FoodType;
import com.example.myfood.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class MyfoodApplicationTests {
@Autowired
private UserDao userDao;
@Autowired
private FoodDao foodDao;
@Autowired
private FoodOtherDao foodOtherDao;
@Autowired
private FoodTypeDao foodTypeDao;

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
    public void getFoodByFoodId(){
        Map foodInfo = foodDao.selectFoodByPrimaryKey(1);
        System.out.println(foodInfo);
    }

    @Test
    public void getFoodOthers(){
        List<FoodOther> foodOthers = foodOtherDao.selectFoodOthers();
        foodOthers.forEach(System.out::println);
    }

    @Test
    public void getFoodOther(){
        Map map = foodOtherDao.selectFoodOtherByFoodName("淮南牛肉汤");
        System.out.println(map);
    }

    @Test
    public void getFoodTypes(){
        List<FoodType> foodTypes = foodTypeDao.selectFoodTypes();
        foodTypes.forEach(System.out::println);
    }

    @Test
    public void getTypeNameByTypeId(){
        Map map = foodTypeDao.selectFoodTypeByTypeId(1);
        System.out.println(map);

    }

}
