package io.gimo.springcloud.eureka.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface TestRemote {

    @GetMapping("/test")
    String test();
}
