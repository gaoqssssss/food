package com.example.myfood.controller;


import com.example.myfood.entity.FoodType;
import com.example.myfood.service.FoodTypeServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/foodType")
public class FoodTypeController {
    @Autowired
    private FoodTypeServcie foodTypeServcie;

    @RequestMapping("/foodTypes")
    public String getFoodTypes(HttpSession session){
        List<FoodType> foodTypes = foodTypeServcie.selectFoodTypes();
        session.setAttribute("foodTypes",foodTypes);
        return "foodTypes";
    }
}
