package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "hello")
@ResponseBody
public class HelloController {
    //responds to /hello
//    @GetMapping("")
//    public String hello() {
//        return "Hello";
//    }

    // responds to get /hello/goodbye
    @GetMapping("goodbye")
    public String helloGoodbye() {
        return "Hello, Goodbye";
    }

    //display form on GET request to /hello
    @GetMapping("")
    public String form() {
        String html = "<html>" +
                "<body><form method='post' >" +
                "<input type='text' name='name'/>" +
                "<select name='language'>" +
                "<option value='English' selected>English</option>" +
                "<option value='French'>French</option>" +
                "<option value='German'>German</option>" +
                "<option value='Spanish'>Spanish</option>" +
                "<option value='Italian'>Italian</option>" +
                "<input type='submit' value='Greet Me!'/>" +
                "</form></body></html>";
        return html;
    }

    @PostMapping("")
    public String welcome(@RequestParam String name, @RequestParam String language) {
        if (name == null || name=="") {
            name = "World";
        }
        return createMessage(name, language);
    }


    public static String createMessage(String name, String selectedLanguage) {
        String language = selectedLanguage.toLowerCase();
        String message = "<h1 style='color=blue; background-color:tomato; text-align:center;'>";
        if (language.equals("english")) {
            message += "Welcome";
        } else if (language.equals("french")) {
            message += "Bonjour";
        } else if (language.equals("german")) {
            message += "Hallo";
        } else if (language.equals("spanish")) {
            message += "Hola ";
        } else if (language.equals("italian")) {
            message += "Bonjourno ";
        }
        return message + " " + name + "</h1>";
    }
}
