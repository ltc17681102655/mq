package com.example.mq.Fanout.provide;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {
    @Autowired
    private AmqpTemplate template;

    public void send(String message) {
        template.convertAndSend("fanoutExchange", "", message);
    }
}
