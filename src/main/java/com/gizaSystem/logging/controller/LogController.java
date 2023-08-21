package com.gizaSystem.logging.controller;


import com.gizaSystem.logging.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

//    @Autowired
    LoggerService loggerService;

    @Autowired
    public LogController(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return loggerService.sayHello(name);
    }
    @GetMapping("/log")
    public String log()
    {
        return loggerService.printLogs();
    }

    @GetMapping("/sum")
    public int sumTwoNumbers()
    {
        return loggerService.sumTwoNumbs();
    }

    @GetMapping("/div")
    public int divTwoNumbers()
    {
        return loggerService.divTwoNumbs();
    }
}

