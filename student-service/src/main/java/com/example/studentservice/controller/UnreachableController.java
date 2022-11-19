package com.example.studentservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author pouchine
 * @email 120L022131@stu.hit.edu.cn
 * @create 2022/11/19 13:31
 */
@Controller
@RequestMapping("/Unreach")
public class UnreachableController {

    @ResponseBody
    @GetMapping("/world")
    public String hello(){
        return "hello";
    }
}
