package com.example.demo.Controller;

import com.example.demo.dto.User;
import com.example.demo.interfaces.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/6/24 0024.
 */

@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @RequestMapping("showUserList")
    public List<User> showUserList(){
        return userClient.showUsers();
    }
}
