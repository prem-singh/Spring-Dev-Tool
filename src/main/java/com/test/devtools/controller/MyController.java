package com.test.devtools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

/**
 * Created by premsingh on 6/3/18.
 */
@Controller
public class MyController {

    @RequestMapping("/test")
    public String handle(Model model) {
        model.addAttribute("msg", "Welcome Prem-1 to DevTools demo for a quick 100");
        return "testView1";
    }

    @RequestMapping("/test2")
    public String handle2(Model model) {
        model.addAttribute("msg2", "a message from controller 2");
        return "testView2";
    }
}
