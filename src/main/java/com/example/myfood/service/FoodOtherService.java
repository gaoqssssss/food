package com.example.myfood.service;

import com.example.myfood.entity.FoodOther;

import java.util.List;
import java.util.Map;

public interface FoodOtherService {
    Map queryFoodOtherByFoodName(String foodName);
    List<FoodOther> queryFoodOthers();

}
