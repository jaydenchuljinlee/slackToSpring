package com.example.slackDemo.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/stop")
public class StopController {

    @GetMapping("/")
    public String stop() throws InterruptedException {

        return "";
    }
}
