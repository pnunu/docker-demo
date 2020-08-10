package com.jt.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pnunu
 * @date 2020/8/10 10:04
 */
@RestController
@RequestMapping
public class HelloController {

    @GetMapping("hello")
    public String hello(String h) throws Exception {
        return "hello : " + h;
    }
}
