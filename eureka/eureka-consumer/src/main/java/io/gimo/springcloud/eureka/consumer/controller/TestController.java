package io.gimo.springcloud.eureka.consumer.controller;

import io.gimo.springcloud.eureka.consumer.service.TestRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestRemote remote;


    @Autowired
    public TestController(TestRemote remote) {
        this.remote = remote;
    }

    @RequestMapping("/consumer/test")
    public String test() {
        return remote.test();
    }
}
