package com.example.myfood.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author : nonewbie
 * @date : 2022-04-16 22:16
 * Description    : swagger 接口文档
 */
@Configuration
@EnableSwagger2
@Slf4j
public class SpringFoxConfig {

    @Value("${swagger.enable}")
    private boolean enableSwagger;

    @Bean
    public Docket createRestApi() {
        log.info("enableSwagger:{}", enableSwagger);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(enableSwagger)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.myfood.controller"))
                .paths(PathSelectors.regex("^(?!lg).*$"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 文档描述
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("微点餐接口文档")
                .description("菜品和点餐功能")
                .termsOfServiceUrl("Swagger UI 暴露地址, eg. http://127.0.0.1:8081/swagger-ui.html")
                .version("1.0.0")
                .build();
    }
}
