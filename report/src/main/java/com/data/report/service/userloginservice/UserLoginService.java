package com.data.report.service.userloginservice;

import com.data.report.inter.mapper.UserLoginMapper;
import com.data.report.pojo.UserLogin;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {
    @Autowired
    private UserLoginMapper userLoginMapper;

    public UserLogin getUser(String name){
        System.out.print("userLoginMapper=================>"+userLoginMapper);
        System.out.print("name=================>"+name);
        UserLogin u = userLoginMapper.getUser(name);
        System.out.print("u=================>"+u);
        return u;
    };

}
