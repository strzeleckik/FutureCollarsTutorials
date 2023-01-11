package com.fc.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TextController {

    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("Someone entered this method!");
        return "Hello everyone!!";
    }

    @GetMapping("/textLength")
    public Integer countTextLength(@RequestParam String text){
        System.out.println("Someone entered this method, countTextLength, text = " + text);
        if (text == null){
            return 0;
        }
        return text.length();
    }

    @GetMapping("/listSize")
    public Integer countListSize(@RequestParam List<String> elements){
        System.out.println("countListSize, elements = " + elements);
        if (elements == null){
            return 0;
        }
        return elements.size();
    }
}
