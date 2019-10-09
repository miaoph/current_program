package com.mph.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


//@ServletComponentScan
@SpringBootApplication
public class ConcurrentProgramApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConcurrentProgramApplication.class, args);
    }

}
