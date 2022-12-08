package com.example.studentservice.service;

import org.springframework.stereotype.Service;

/**
 * @author pouchine
 * @email 120L022131@stu.hit.edu.cn
 * @create 2022/12/8 23:17
 */
@Service
public interface Ipv4Service {
    public String getLocalAddress();
}
