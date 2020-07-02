package com.client3.client3.rest;

import com.client3.client3.service.TestService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/c3")
public class TestClient3Rest {
    @Autowired
    private TestService testService;

    @RequestMapping("/TestClient3Rest")
   public String test(){
       return  "test";
   }


    @GetMapping("/test")
    @ResponseBody
    public List<Map<Object,Object>> test1(@RequestParam(value = "name") String  name ){
        System.out.print("testService.test(name)=================================>"+testService.test(name));

        return testService.test(name);
    }
}
