package com.offcn.SessionController;

import com.offcn.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/session")
public class SessionController {

    @RequestMapping("/put")
    public String putSession(HttpSession session){
        session.setAttribute("username","小红");
        return "success";
    }
    @RequestMapping("/get")
    public String getSession(HttpSession session){

        return (String) session.getAttribute("username");
    }
}
