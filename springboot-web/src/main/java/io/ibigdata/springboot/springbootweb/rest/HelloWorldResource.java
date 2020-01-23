package io.ibigdata.springboot.springbootweb.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {
    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }
}
