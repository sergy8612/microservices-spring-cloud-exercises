package com.gfttraining.simn.udemy.springcloud.dao;

import com.gfttraining.simn.udemy.springcloud.domain.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SUBJECT")
public interface SubjectClient {

    @GetMapping("/")
    public Word getWord();
}
