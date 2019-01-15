package com.example.mq.p2p.controller;

import com.example.mq.p2p.provider.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqController {

    @Autowired
    private HelloSender sender;

    @RequestMapping("send")
    public String mq(String message) {
        sender.send(message);
        return "send-ok";
    }
}
