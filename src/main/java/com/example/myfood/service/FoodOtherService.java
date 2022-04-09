package com.example.myfood.service;

import com.example.myfood.entity.FoodOther;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FoodOtherService {
    int queryFoodOtherByFoodName(String foodName);
    List<FoodOther> queryFoodOthers();

}
