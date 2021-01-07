package com.fyc.ssm.controller;

import com.fyc.ssm.pojo.Result;
import com.fyc.ssm.pojo.User;
import com.fyc.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "heloo";
    }


    @Autowired
    private UserService userService;
    @GetMapping(value = "/user")
    @ResponseBody
    public List<User> getAll(){
        List<User> all = userService.getAll();
        return all;
    }
    @GetMapping("/user/now")
    @ResponseBody
    public String selectNow(){
        return userService.selectNow();
    };

    @GetMapping(value = "/user/{name}")
    @ResponseBody
    public User queryUserByName(@PathVariable("name")String name){
        User user = userService.queryUserByName(name);
        return user;
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @ResponseBody
    public Map addUser(User user){
        Long i = userService.addUser(user);
        System.out.println(i);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",200);
        return map;
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    @ResponseBody
    public Result updateSelect(User user){
        Long aLong = userService.updateSelect(user);
        return new Result(true,200,"更新成功",aLong);
    }

    @DeleteMapping("/user/{id}")
    @ResponseBody
    public Result deleteUserById(@PathVariable("id")Long id){
        userService.deleteByUserId(id);
        return new Result(true,200,"删除成功",null);
    }
}
