package com.example.mq.p2s.controller;

import com.example.mq.p2s.provider.TopicSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @Autowired
    private TopicSender topicSender;

    @RequestMapping("topic-send")
    public void send(String message) {
        topicSender.send(message);
    }

}
