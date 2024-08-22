package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello-world")
    public String hello(){
        return "Hello, This is my first API";
    }

    @PostMapping("/hello-world")
    public String helloPost(@RequestBody String name){
        return "Hello, " + name + "!";
    }

    @GetMapping("/hello-world-v1")
    public HelloResponse helloWorld(){
        return new HelloResponse("Hello, This is my first API!");
    }

    @GetMapping("/hello-world-v1/{name}")
    public HelloResponse helloWorldParam(@PathVariable String name){
        return new HelloResponse("Hello, " + name);
    }


}
