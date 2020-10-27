package com.offcn.controller;


import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("thyme")
public class ThymeleafTest {
    @RequestMapping("/demo01")
    public String demo_01(Model model){
        model.addAttribute("name","小红");
        return "index1";
    }

    @RequestMapping("demo02")
    public String demo02(Model model){
        User user=new User("小丽","一班",70);
        model.addAttribute("user",user);
        return "index1";
    }

    @RequestMapping("demo03")
    public String demo03(Model model){
        List<User> list =new ArrayList<>();
        for (int i=0;i<10;i++){
       list.add(new User("小红"+i+"号",i+1+"班",i+15));
        }
        model.addAttribute("list",list);
        return "index1";
    }
}
