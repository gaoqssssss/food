package com.example.myfood.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class ResultVO {
    private Integer code;
    private String msg;
    private Integer count;
    private Object data;
    private String message;
    private boolean success;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setCode(int i) {
    }

    public void setMsg(String 请求成功) {
    }

    public void setCount(int size) {
    }

    public void setData(List<User> users) {
    }
}
