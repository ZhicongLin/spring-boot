package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zc.lin on 2017/3/17.
 */
@Controller
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "hello world!";
    }
}
