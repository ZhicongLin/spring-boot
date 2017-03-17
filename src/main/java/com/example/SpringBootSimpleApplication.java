package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SpringBootSimpleApplication {

    @RequestMapping(value = {"/", "index"})
    @ResponseBody
    public String welcome() {
        return "Welcome to spring boot simple!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSimpleApplication.class, args);
    }
}
