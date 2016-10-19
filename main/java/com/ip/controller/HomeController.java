package com.ip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
/**
 * Created by fatima on 19/10/16.
 */


@Controller
public class HomeController {


    @RequestMapping(value="/")
    public String test() {
        return "home";
    }
}


//Test