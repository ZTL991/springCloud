package com.data.report.inter.mapper;

import com.data.report.pojo.UserLogin;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import tk.mybatis.mapper.common.Mapper;
@Repository
@org.apache.ibatis.annotations.Mapper
public interface UserLoginMapper extends Mapper<UserLogin> {
    //@Select("select * from userlogin where username=#{name } ")
    public UserLogin getUser(@RequestParam(value = "name") String name);
}