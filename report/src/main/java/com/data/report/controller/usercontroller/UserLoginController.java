package com.data.report.controller.usercontroller;

import com.data.report.pojo.UserLogin;
import com.data.report.service.userloginservice.UserLoginService;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user/login")
public class UserLoginController {
    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping(value = "/userlogin",produces="application/json;charset=UTF-8")
    @ResponseBody
    public List<Map<Object, Object>> UserLogin(@RequestParam(value = "name") String name) throws Exception {
        List<Map<Object, Object>> list = new ArrayList<Map<Object, Object>>();
        Map<Object, Object> map = new HashMap<Object, Object>();
        System.out.print("UserLoginControllername===>"+name);
        UserLogin u =  userLoginService.getUser(name);
        System.out.print("UserLoginController===>"+u.getPassword());
        if (u != null){
            map.put("code",0);
            map.put("login",1);
            map.put("name",u.getUsername());
            map.put("message","登录成功");

        }else {
            map.put("code",1);
            map.put("login",0);
            map.put("message","登录失败");
        }
        list.add(map);
        return list;
    }
}
