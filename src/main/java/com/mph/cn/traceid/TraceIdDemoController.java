package com.mph.cn.traceid;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TraceIdDemoController {

    @GetMapping("/demo/by-name")
    public String demo(String name) {
        log.info("name:" + name);
        log.info("1111111:" + name);
        return name;
    }
}
