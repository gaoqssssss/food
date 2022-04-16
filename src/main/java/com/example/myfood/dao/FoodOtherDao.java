package com.example.myfood.dao;

import com.example.myfood.entity.FoodOther;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface FoodOtherDao {
    Map selectFoodOtherByFoodName(String foodName);
    List<FoodOther> selectFoodOthers();

}
