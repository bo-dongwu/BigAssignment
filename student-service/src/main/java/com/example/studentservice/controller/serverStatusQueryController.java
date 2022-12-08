package com.example.studentservice.controller;

import com.example.studentservice.service.Ipv4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author pouchine
 * @email 120L022131@stu.hit.edu.cn
 * @create 2022/12/8 22:54
 */
@Controller
@RequestMapping("/queryServer")
public class serverStatusQueryController {
    @Resource
    private Ipv4Service ipv4Service;

    @ResponseBody
    @GetMapping("/time")
    public String queryServer(){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(new Date()));
        return "Now : "+format.format(new Date())+"\n"+"Service From: "+ipv4Service.getLocalAddress();
    }
}
