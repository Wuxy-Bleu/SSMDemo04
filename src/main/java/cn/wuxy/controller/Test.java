package cn.wuxy.controller;

import cn.wuxy.bean.User;
import cn.wuxy.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class Test {

    @Autowired
    private IUserDao userDao;

//    @RequestMapping("/test01")
//    public String test01() {
//        System.out.println("qywehfakjhgkasfga");
//
////        ModelAndView modelAndView = new ModelAndView();
////
////        List<User> users = userDao.findAll();
////
////        modelAndView.setViewName("jump");
////        modelAndView.addObject("select", users);
//
//        return "jump";
//    }

    @RequestMapping("/calldata")
    @ResponseBody
    public Map<String, List<User>> callData() {
//    public String callData() {
//        System.out.println("calldata here");

        System.out.println("here??????????????????");

        List<User> users = userDao.findAll();

//        for (User user : users)
//            System.out.println(user);
        System.out.println("calldata");

        Map<String, List<User>> map = new HashMap();
        map.put("res", users);

        return map;
//        return "map";
    }
}
