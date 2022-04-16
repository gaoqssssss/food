package com.example.myfood.dao;

import com.example.myfood.entity.FoodType;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface FoodTypeDao {
    List<FoodType> selectFoodTypes();
    Map selectFoodTypeByTypeId(Integer typeId);

}
