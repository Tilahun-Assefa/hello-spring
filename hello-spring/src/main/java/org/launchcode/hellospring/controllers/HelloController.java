package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="hello")
@ResponseBody
public class HelloController {
    //responds to /hello
    @GetMapping("")
    public String hello() {
        return "Hello";
    }

    // responds to get /hello/goodbye
    @GetMapping("goodbye")
    public String helloGoodbye() {
        return "Hello, Goodbye";
    }
}
