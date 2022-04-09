package com.example.myfood.dao;

import com.example.myfood.entity.FoodOther;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodOtherDao {
    int selectFoodOtherByFoodName(String foodName);
    List<FoodOther> selectFoodOthers();

}
