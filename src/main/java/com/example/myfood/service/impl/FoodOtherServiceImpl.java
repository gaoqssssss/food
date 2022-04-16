package com.example.myfood.service.impl;

import com.example.myfood.dao.FoodOtherDao;
import com.example.myfood.entity.FoodOther;
import com.example.myfood.service.FoodOtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FoodOtherServiceImpl implements FoodOtherService {
    @Autowired
    private FoodOtherDao foodOtherDao;
    @Override
    public Map queryFoodOtherByFoodName(String foodName) {
        return foodOtherDao.selectFoodOtherByFoodName(foodName);
    }

    @Override
    public List<FoodOther> queryFoodOthers() {
        return foodOtherDao.selectFoodOthers();
    }
}
