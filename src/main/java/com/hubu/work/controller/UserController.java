package com.hubu.work.controller;

import com.hubu.work.H2_MyBatis.pojo.User;
import com.hubu.work.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation("查询全部用户")
    @GetMapping(value = "selectAll")
    public List<User> selectAll() {

        return userService.selectAll();
    }

    @ApiOperation("登录操作")
    @GetMapping(value = "login")
    public int login(User user) {
        return userService.login(user);
    }
    // public PageBean(List<T> list){
    //if (list instanceof Page) {
    //  Page<T> page = (Page<T>) list;
    //   this.pageNum = page.getPageNum();
    //    this.pageSize = page.getPageSize();
    //    this.total = page.getTotal();
    //    this.pages = page.getPages();
    //    this.list = page;
    //    this.size = page.size();
    //  }
    //}

    @ApiOperation("用户注册")
    @GetMapping(value = "registerUser")
    public int registerUser(User user){
//        userService.registerUser(user);
//
//        Integer id = user.getId();
//        System.out.println(id);
//        user.setHead_portrait("pictures/"+id+".jpg");

        return userService.registerUser(user);
    }
}
