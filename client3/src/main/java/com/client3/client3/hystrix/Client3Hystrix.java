package com.client3.client3.hystrix;

import com.client3.client3.inter.Test;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
public class Client3Hystrix implements Test {
    @Override
    public List<Map<Object, Object>> getUser(String name) {
        List<Map<Object, Object>> list = new ArrayList<Map<Object, Object>>();
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("code","-99");
        map.put("message","服务异常");
        list.add(map);
        return list;
    }
}
