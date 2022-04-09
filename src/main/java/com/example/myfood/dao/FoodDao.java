package com.example.myfood.dao;

import com.example.myfood.entity.Food;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodDao {

    List<Food> selectFoods();
    int selectFoodByPrimaryKey();
}
