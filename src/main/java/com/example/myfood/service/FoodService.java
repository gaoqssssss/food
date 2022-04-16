package com.example.myfood.service;

import com.example.myfood.entity.Food;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface FoodService {
    List<Food> queryFoods();
    Map queryFoodByPrimaryKey(Integer foodId);

}
