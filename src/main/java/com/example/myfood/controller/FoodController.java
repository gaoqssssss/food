package com.example.myfood.controller;


import com.example.myfood.entity.Food;
import com.example.myfood.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @RequestMapping("/foods")
    public String getFoods(HttpSession session){
        List<Food> foods = foodService.queryFoods();
        session.setAttribute("foods",foods);
        return "foods";
    }
}
