package io.ken.springboot.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    String index(){
        return "Hello World!";
    }

    @RequestMapping("/godv")
    @ResponseBody
    String godv(){
        return "天不生我高德伟,吃鸡万古如长夜!";
    }

    @RequestMapping("/welcome")
    ModelAndView welcome(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcome");
        modelAndView.addObject("message","Welcome to Spring Boot");
        return modelAndView;
    }
}
