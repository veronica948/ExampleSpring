package com.haritonova.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/simple")
public class HelloController {
    @RequestMapping("/welcome")
    public ModelAndView helloWorld() {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("hello_message","hello");
        return model;
    }
}
