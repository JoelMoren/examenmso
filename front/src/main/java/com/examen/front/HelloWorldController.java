package com.examen.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @RequestMapping("/welcome")
    public ModelAndView firstPage() {
        return new ModelAndView("welcome");
    }

}