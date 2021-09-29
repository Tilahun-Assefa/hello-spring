package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // responds to get requests at "/hello"
    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello, Spring!";
    }

    // responds to get requests at "/goodbye"
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Good Bye, Spring!";
    }
}
