package com.example.myfood.dao;

import com.example.myfood.entity.Food;
import com.example.myfood.entity.FoodDetail;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface FoodDao {

    List<Food> selectFoods();

    Map selectFoodByPrimaryKey(Integer foodId);

    List<FoodDetail> selectFoodByType(Integer typeId);
}
