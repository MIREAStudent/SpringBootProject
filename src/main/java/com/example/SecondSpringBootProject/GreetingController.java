package com.example.SecondSpringBootProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController{
    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(required = false, defaultValue = "papich") String name, Map<String, Object> model
    ){

        model.put("name", name);

        return "greeting";
    }

    @GetMapping
    public String main(@RequestParam(name="login", required = false, defaultValue = "") String login,@RequestParam(name="password", required = false, defaultValue = "") String password, Map<String, Object> model){

        model.put("login", login);
        model.put("password", password);

        return "main";
    }


}
