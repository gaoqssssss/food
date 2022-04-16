package com.example.myfood.controller;


import com.example.myfood.entity.FoodOther;
import com.example.myfood.service.FoodOtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/foodOther")
public class FoodOtherController {
    @Autowired
    private FoodOtherService foodOtherService;
    @RequestMapping("/foodOthers")
    public String getFoodOthers(HttpSession session){
        List<FoodOther> foodOthers = foodOtherService.queryFoodOthers();
        session.setAttribute("foodOthers",foodOthers);
        return "foodOthers";
    }
}
