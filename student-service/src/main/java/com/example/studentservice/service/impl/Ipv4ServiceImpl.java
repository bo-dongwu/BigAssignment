package com.example.studentservice.service.impl;

import com.example.studentservice.service.Ipv4Service;
import com.example.studentservice.util.GetLocalHostAddr;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author pouchine
 * @email 120L022131@stu.hit.edu.cn
 * @create 2022/12/8 23:18
 */
@Component
public class Ipv4ServiceImpl implements Ipv4Service {
    @Override
    public String getLocalAddress() {
        String ip =  GetLocalHostAddr.getLocalHostAddr();
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        int serverPort = request.getServerPort();
        String from = "http://"+ip +":"+ serverPort;
        return from;
    }
}
