package com.example.mq.p2s.provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {

    @Autowired
    private AmqpTemplate template;

    public void send(String message) {
        template.convertAndSend("exchange", "topic.message", message);
    }
}
