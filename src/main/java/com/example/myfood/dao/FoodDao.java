package com.example.myfood.dao;

import com.example.myfood.entity.Food;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface FoodDao {

    List<Food> selectFoods();

    Map selectFoodByPrimaryKey(Integer foodId);
}
