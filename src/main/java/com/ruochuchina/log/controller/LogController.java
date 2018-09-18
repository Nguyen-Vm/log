package com.ruochuchina.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RWM
 * @date 2018/4/23
 */
@RestController
public class LogController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(path = "/log", method = RequestMethod.GET)
    public void log(){
        int j = 20000;
        for(int i=0;i<j;i++){
            logger.info("info execute index method");
            logger.warn("warn execute index method");
            logger.error("error execute index method");
        }
    }
}
