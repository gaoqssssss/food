package com.example.myfood.service.impl;

import com.example.myfood.dao.FoodDao;
import com.example.myfood.dao.UserDao;
import com.example.myfood.entity.Food;
import com.example.myfood.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
   @Autowired
    private FoodDao foodDao;


    @Override
    public List<Food> queryFoods() { return foodDao.selectFoods();}

    @Override
    public int queryFoodByPrimaryKey(Integer foodId) {
        return foodDao.selectFoodByPrimaryKey();
    }
}
