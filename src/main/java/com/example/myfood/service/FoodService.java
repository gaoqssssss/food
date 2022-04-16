package com.example.myfood.service;

import com.example.myfood.entity.Food;

import java.util.List;
import java.util.Map;

public interface FoodService {
    List<Food> searchFoodsByName();

    Map queryFoodByPrimaryKey(Integer foodId);

    /**
     * 根据名称模糊搜索菜信息
     *
     * @param name 名称
     * @return 菜品信息
     */
    List<Food> searchFoodsByName(String name);

}
