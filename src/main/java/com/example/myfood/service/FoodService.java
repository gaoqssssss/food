package com.example.myfood.service;

import com.example.myfood.entity.Food;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FoodService {
    List<Food> queryFoods();
    int queryFoodByPrimaryKey(Integer foodId);

}
