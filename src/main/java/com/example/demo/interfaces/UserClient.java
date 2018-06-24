package com.example.demo.interfaces;

import com.example.demo.dto.User;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2018/6/24 0024.
 */

@FeignClient("springbootstudy")
public interface UserClient {

    @RequestMapping("showUser")
    public List<User> showUsers();
}
