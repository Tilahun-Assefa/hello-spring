package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // responds to get requests at "/hello?coder=LaunchCoder"
    @GetMapping("hello")
    @ResponseBody
    public String hello(@RequestParam String coder) {
        return "Hello, "+ coder + "!";
    }

    // responds to get requests at "/goodbye"
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Good Bye, Spring!";
    }
}
