package com.example.myfood.controller;


import com.example.myfood.entity.Food;
import com.example.myfood.service.FoodService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/food")
@Api(tags = {"菜品"})
@Slf4j
public class FoodController {
    @Autowired
    private FoodService foodService;

    @RequestMapping(value = "/foods")
    public String getFoods(HttpSession session) {
        List<Food> foods = foodService.searchFoodsByName();
        session.setAttribute("foods", foods);
        return "foods";
    }


    @ApiOperation(value = "根据名称搜索菜品信息", notes = "搜索", httpMethod = "GET", produces = "application/json", protocols = "http")
    @ApiImplicitParams({@ApiImplicitParam(name = "name", value = "菜名", paramType = "query", dataType = "String", example = "肉")})
    @ApiResponses({@ApiResponse(code = 200, message = "请求成功", response = Food.class)})
    @GetMapping("/search")
    public List<Food> searchFoodsByName(@Param("name") String name) {
        log.info("searchFoodsByName name={}", name);
        List<Food> foods = foodService.searchFoodsByName(name);
        log.info("searchFoodsByName, foods={}", foods);
        return foods;
    }
}
