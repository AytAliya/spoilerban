package com.spoilerban.spoilerban.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/test")
public class TestController {

    @GetMapping
    public String helloTest(){
        return "HelloWorld";
    }

}
