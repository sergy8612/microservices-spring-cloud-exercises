package com.gfttraining.simn.udemy.springcloud.controllers;

import com.gfttraining.simn.udemy.springcloud.dao.Word;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${words}")
    String words;

    @GetMapping("/")
    public @ResponseBody Word getWord() {
        String[] wordArray = words.split(",");
        int i = (int)Math.round(Math.random() * (wordArray.length - 1));
        return new Word(wordArray[i]);
    }
}
