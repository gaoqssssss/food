package com.example.myfood.service.impl;

import com.example.myfood.dao.FoodTypeDao;
import com.example.myfood.entity.FoodType;
import com.example.myfood.service.FoodTypeServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FoodTypeServiceImpl implements FoodTypeServcie {
    @Autowired
   private FoodTypeDao foodTypeDao;

    @Override
    public List<FoodType> selectFoodTypes() {
        return foodTypeDao.selectFoodTypes();
    }

    @Override
    public Map queryFoodTypeByTypeId(Integer typeId) {
        return foodTypeDao.selectFoodTypeByTypeId(typeId);
    }

}
