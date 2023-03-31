package cn.moremind.moremind.example.module1.consumer.controller;

import cn.moremind.example.module1.api.openfeign.feign.HelloFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class TestHelloController {
    
    private final HelloFeignService helloFeignService;
    
    public TestHelloController(HelloFeignService helloFeignService) {
        this.helloFeignService = helloFeignService;
    }
    
    
    @GetMapping("/hello")
    public String testHello() {
        return helloFeignService.hello();
    }
}
