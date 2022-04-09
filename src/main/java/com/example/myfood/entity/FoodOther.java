package com.example.myfood.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class FoodOther {
    private String foodName;
    private String foodMake;
    private Integer foodPrice;
    private Integer foodSale;

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodMake() {
        return foodMake;
    }

    public void setFoodMake(String foodMake) {
        this.foodMake = foodMake;
    }

    public Integer getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Integer foodPrice) {
        this.foodPrice = foodPrice;
    }

    public Integer getFoodSale() {
        return foodSale;
    }

    public void setFoodSale(Integer foodSale) {
        this.foodSale = foodSale;
    }

    @Override
    public String toString() {
        return "FoodOther{" +
                "foodName='" + foodName + '\'' +
                ", foodMake='" + foodMake + '\'' +
                ", foodPrice=" + foodPrice +
                ", foodSale=" + foodSale +
                '}';
    }
}
