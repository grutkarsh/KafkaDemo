package com.example.kafka.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.service.ProducerService;

@RestController
@RequestMapping("/kafka")
public  class KafkaController {
	
	@Autowired
      ProducerService producerService;

    /*public KafkaController(ProducerService producerService) {
        this.producerService = producerService;
    }*/

    @PostMapping(value = "/publish")
    public String sendMessageToKafkaTopic(@RequestParam String message) {
        return producerService.sendMessage(message);
    }
}