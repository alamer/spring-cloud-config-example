package com.alamer.cloudconfig.client.api;

import com.alamer.cloudconfig.client.configuration.ApplicationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    ApplicationConfiguration configuration;

    @PostConstruct
    public void init() {
        System.out.println(configuration.getTest());
    }


    @RequestMapping(value = "/message",method = RequestMethod.GET)
    public String message(){
        return configuration.getTest();
    }

}
