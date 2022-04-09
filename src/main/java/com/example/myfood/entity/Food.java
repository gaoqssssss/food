package com.example.myfood.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Food {
    private Integer foodId;
    private String foodName;
    private Integer typeId;
    private String foodMessage;
    private Integer foodClick;
    private Integer foodPay;
    private String foodPicture;

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getFoodMessage() {
        return foodMessage;
    }

    public void setFoodMessage(String foodMessage) {
        this.foodMessage = foodMessage;
    }

    public Integer getFoodClick() {
        return foodClick;
    }

    public void setFoodClick(Integer foodClick) {
        this.foodClick = foodClick;
    }

    public Integer getFoodPay() {
        return foodPay;
    }

    public void setFoodPay(Integer foodPay) {
        this.foodPay = foodPay;
    }

    public String getFoodPicture() {
        return foodPicture;
    }

    public void setFoodPicture(String foodPicture) {
        this.foodPicture = foodPicture;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodId=" + foodId +
                ", foodName='" + foodName + '\'' +
                ", typeId=" + typeId +
                ", foodMessage='" + foodMessage + '\'' +
                ", foodClick=" + foodClick +
                ", foodPay=" + foodPay +
                ", foodPicture='" + foodPicture + '\'' +
                '}';
    }
}
