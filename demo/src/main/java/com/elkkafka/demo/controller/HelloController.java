package com.elkkafka.demo.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

// @Slf4j의 topic 옵션으로 logger을 지정해줍니다.
@Slf4j(topic = "kafka-logger")
@RestController
@RequiredArgsConstructor
public class HelloController {
    
    @GetMapping({"", "/hello"})
    public String hello() throws IOException {
        // kafka logger에 로그 남기기
        log.info("hello~!@");
        return "hello";
    }
}