package org.huantian.bettermanagement_serverside.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping("/ciallo")
    public String ciallo() {
        return "Ciallo";
    }
}
