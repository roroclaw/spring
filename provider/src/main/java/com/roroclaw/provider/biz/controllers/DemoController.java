package com.roroclaw.provider.biz.controllers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class DemoController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hi")
    public String helloboot(String name){
        String ip = "";
        try {
            InetAddress address = InetAddress.getLocalHost();
            ip = address.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        if(StringUtils.isEmpty(name)){
            name = "boot";
        }
        return "hello "+name+" !!" + "ip:"+ip+",port="+port;
    }

}
