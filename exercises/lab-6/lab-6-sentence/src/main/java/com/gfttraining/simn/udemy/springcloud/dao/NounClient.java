package com.gfttraining.simn.udemy.springcloud.dao;

import com.gfttraining.simn.udemy.springcloud.domain.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("NOUN")
public interface NounClient {

    @GetMapping("/")
    public Word getWord();
}
