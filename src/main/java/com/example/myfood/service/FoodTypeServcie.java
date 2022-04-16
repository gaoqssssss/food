package com.example.myfood.service;

import com.example.myfood.entity.FoodType;

import java.util.List;
import java.util.Map;

public interface FoodTypeServcie {
    List<FoodType> selectFoodTypes();
    Map queryFoodTypeByTypeId(Integer typeId);
}
