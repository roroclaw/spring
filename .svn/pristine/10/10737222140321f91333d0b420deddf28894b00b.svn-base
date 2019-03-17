package com.roroclaw.consumefeign.biz.servers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SERVICE-HI")
public interface IDemoService {

    @GetMapping("/hi")
    String hello();

}
