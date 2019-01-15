package com.example.mq.p2p.provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class HelloSender implements Serializable {
    @Autowired
    private AmqpTemplate template;

    public void send(String message) {
        template.convertAndSend("queue", message);
    }
}
