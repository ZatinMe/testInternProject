package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFile {

    @GetMapping("/get")
    public String testFunc(){
        return "<tr><tr><h1 style = \"color:blue;\">Hello World!!<h1>";
    }

    @PostMapping("/post")
    public String testPostFunc(){
        return "Hello World!!";
    }
}
