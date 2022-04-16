//package com.example.myfood.controller;
//
//import com.example.myfood.entity.ResultVO;
//import com.example.myfood.entity.User;
//import com.example.myfood.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.util.List;
//
//@Controller
//@RequestMapping("/user")
//public class UserController {
//    @Autowired
//    private UserService userService;
//
//    @ResponseBody
//    @RequestMapping("/users")
//    public ResultVO getUsers(){
//        List<User> users =userService.queryUsers();
//        ResultVO resultVO = new ResultVO();
//        resultVO.setCode(0);
//        resultVO.setMsg("请求成功");
//        resultVO.setCount(users.size());
//        resultVO.setData(users);
//        return resultVO;
//    }
//
//
//    @RequestMapping("/users")
//    public String getUsers(HttpSession session){
//        List<User> users = userService.queryUsers();
//        session.setAttribute("users",users);
//        return "users";
//    }
//
////    public String login(HttpServletRequest request, HttpServletResponse response) {
////        // 收参
////        String username = request.getParameter("username");
////        String password = request.getParameter("password");
////        // 登录
////        ResultVO resultVO = userService.login(username, password);
////        return "";
////    }
//}