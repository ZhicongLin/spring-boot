package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zc.lin on 2017/3/17.
 */
@Controller
@RequestMapping("hello")
public class HelloController {

    @RequestMapping(value = "index", method = RequestMethod.POST)
    @ResponseBody
    public String index() {
        return"hello world!";
    }
}
