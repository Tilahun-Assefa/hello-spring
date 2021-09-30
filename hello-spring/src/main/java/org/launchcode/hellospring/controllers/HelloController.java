package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @GetMapping
    @ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form method='post' action='/hello'>" +
                "<input type='text' name='coder'/>" +
                "<input type='submit' value='Greet Me'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    // responds to get requests at "/hello?coder=LaunchCoder"
    @RequestMapping(value="hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String coder) {
        return "Hello, " + coder + "!";
    }
}
