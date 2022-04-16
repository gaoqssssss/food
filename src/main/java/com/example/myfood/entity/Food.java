package com.example.myfood.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "菜品信息")
public class Food {
    @ApiModelProperty(value = "id", example = "10", dataType = "java.lang.Integer")
    private Integer foodId;

    @ApiModelProperty(value = "id", example = "锅包肉", dataType = "java.lang.String")
    private String foodName;

    @ApiModelProperty(value = "菜品类型id", example = "2", dataType = "java.lang.Integer")
    private Integer typeId;

    @ApiModelProperty(value = "简单描述", example = "红烧肉，一道著名的大众菜肴，各大菜系都有自己特色的红烧肉。其以五花肉为制作主料，最好选用肥瘦相间的三层肉（五花肉）来做，锅具以砂锅为主，做出来的肉肥瘦相间，香甜松软，营养丰富，入口即化。", dataType = "java.lang.String")
    private String foodMessage;

    @ApiModelProperty(value = "浏览次数", example = "10", dataType = "java.lang.Integer")
    private Integer foodClick;

    @ApiModelProperty(value = "下单次数", example = "10", dataType = "java.lang.Integer")
    private Integer foodPay;

    @ApiModelProperty(value = "图片链接", example = "10", dataType = "java.lang.String")
    private String foodPicture;
}
