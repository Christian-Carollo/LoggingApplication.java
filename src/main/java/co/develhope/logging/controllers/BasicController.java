package co.develhope.logging.controllers;

import co.develhope.logging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicController {

    @Autowired
    BasicService basicService;

    Logger logger = LoggerFactory.getLogger(BasicController.class);


    @GetMapping("/message")
    public void welcomeMessage(){
        logger.info("Welcome to the Basic Controller");
    }

    @GetMapping("/exp")
    public int exp(){
        return basicService.getPotenza();
    }

    @GetMapping("/error")
    public void error(){
        Error error = new Error();
        logger.error("This is an ERROR logging", error);
    }
}
