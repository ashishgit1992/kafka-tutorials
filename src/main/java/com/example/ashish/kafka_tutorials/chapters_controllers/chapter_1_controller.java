package com.example.ashish.kafka_tutorials.chapters_controllers;

import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.http.HttpResponse;


@Controller
@RequestMapping("/chapter1")
public class chapter_1_controller {
    Logger log = LoggerFactory.getLogger(chapter_1_controller.class);

    @Autowired
    @Qualifier("topic1")
    private NewTopic topic1;
    @Autowired
    @Qualifier("topic2")
    private NewTopic topic2;

    @GetMapping("/createTopic")
    public ResponseEntity<?> createTopic() {
        log.info("topic with name {} has been created", topic1.name());
        return ResponseEntity.status(200).build();
    }
}
