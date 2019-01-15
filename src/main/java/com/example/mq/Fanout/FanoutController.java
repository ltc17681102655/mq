package com.example.mq.Fanout;

import com.example.mq.Fanout.provide.FanoutSender;
import com.example.mq.p2p.provider.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FanoutController {

    @Autowired
    private FanoutSender sender;

    @RequestMapping("fanout-mq")
    public String mq(String message) {
        sender.send(message);
        return "send-ok";
    }
}
