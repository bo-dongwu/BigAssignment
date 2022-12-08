package com.example.studentservice.util;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author pouchine
 * @email 120L022131@stu.hit.edu.cn
 * @create 2022/12/8 23:14
 */
public class GetLocalHostAddr {

    public static String getLocalHostAddr() {

        Enumeration allNetInterfaces;
        Vector ipAddr = new Vector();
        String ipLocalAddr = null;
        InetAddress ip = null;
        try {
            allNetInterfaces = NetworkInterface.getNetworkInterfaces();
            while (allNetInterfaces.hasMoreElements()) {
                NetworkInterface netInterface = (NetworkInterface)
                        allNetInterfaces.nextElement();
                Enumeration addresses = netInterface.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    ip = (InetAddress) addresses.nextElement();
                    ipAddr.add(ip.toString());
                    //IP是ipv4，ipv6换成Inet6Address
                    if (ip != null && ip instanceof Inet4Address)
                    {
                        String hostAddress = ip.getHostAddress();
                        if (!hostAddress.equals("127.0.0.1") && !hostAddress.equals("/127.0.0.1")) {
                            //得到本地IP
                            ipLocalAddr = ip.toString().split("[/]")[1];
                        }
                    }
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return ipLocalAddr;
    }
}