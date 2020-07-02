package com.client3.client3.inter;

import com.client3.client3.hystrix.Client3Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(name = "report",fallback = Client3Hystrix.class)
public interface Test {
    @GetMapping("/user/login/userlogin")
    public List<Map<Object,Object>> getUser(@RequestParam(value = "name") String name);

}
