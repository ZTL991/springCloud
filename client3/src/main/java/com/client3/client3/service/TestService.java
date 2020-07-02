package com.client3.client3.service;

import com.client3.client3.inter.Test;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestService {
    @Autowired
    private Test testInter;

    public List<Map<Object,Object>> test(String name){
        System.out.print("testInter===>"+testInter);
        return testInter.getUser(name);
    }
}
