package cn.moremind.example.module1.api.openfeign.feign;

import cn.moremind.example.module1.api.openfeign.constants.FeignClientNames;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = FeignClientNames.MODULE1_API_SERVICE, path = FeignClientNames.MODULE1_API_TEST)
public interface HelloFeignService {
    
    @GetMapping("/hello")
    String hello();
    
}
