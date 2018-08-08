package com.tim.sbootweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  
 * 
 * @author kyle
 * @date 2018/8/1 18:39
 * @param 
 * @return 
 */


@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("name","lijing");
        return "hello";
    }

}
