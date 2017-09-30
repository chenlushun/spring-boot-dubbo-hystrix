package com.alex.spring.boot.dubbo.provider.impl;

import com.alex.spring.boot.dubbo.provider.User;
import com.alex.spring.boot.dubbo.provider.UserManger;
import com.alibaba.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author Alex
 **/
@Component
@DubboService
public class UserMangerImpl  implements UserManger{

    public User findById(Long id) {
        User user=new User();
        user.setId(id);
        user.setAge(18);
        user.setName("刘德华");

        return user;
    }
}
