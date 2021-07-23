package com.example.helloworld;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: dzl
 * @ssistants:
 * @date: 2021/7/23 14:41
 * @annotation:
 */
@Controller
public class testController {
    @RequestMapping("/hello")
    @ResponseBody
    public String test(){
        return "hello world!";
    }
}
