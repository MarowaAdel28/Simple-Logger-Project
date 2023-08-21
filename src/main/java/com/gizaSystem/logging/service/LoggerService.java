package com.gizaSystem.logging.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import com.gizaSystem.logging.controller.HelloController;
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class LoggerService {

//     // creating a logger
    Logger logger
            = LoggerFactory.getLogger(LoggerService.class);

    public String sayHello(String name) {
        logger.info("INFO: request from {} ",name);
        String response = "hello " + name;
        logger.info("INFO: response is {} ",response);
        return response;
    }

    public String printLogs() {
        // Logging various log level messages
        logger.trace("Log level: TRACE");
        logger.info("Log level: INFO");
        logger.debug("Log level: DEBUG");
        logger.error("Log level: ERROR");
        logger.warn("Log level: WARN");
        return "Hey! You can check the output in the logs";
    }

    public int sumTwoNumbs() {
        logger.info("INFO: Start Sum Two Numbers 5 + 2 !");
        int result =  5 + 2;
        logger.info("INFO: end Sum Two Numbers!");
        return result;
    }

    public int divTwoNumbs() {
        logger.info("INFO: Start div Two Numbers 5 + 2 !");
        int result =  0;
        try {
            result = 5/0;
        } catch (ArithmeticException exp) {
            logger.error("Error: divide by Zero");
        }
        logger.info("INFO: end div Two Numbers!");
        return result;
    }
}
