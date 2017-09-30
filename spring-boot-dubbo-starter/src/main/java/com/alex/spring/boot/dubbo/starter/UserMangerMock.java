package com.alex.spring.boot.dubbo.starter;

import com.alex.spring.boot.dubbo.provider.User;
import com.alex.spring.boot.dubbo.provider.UserManger;
import com.alibaba.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author Alex
 **/
@DubboService
@Component
public class UserMangerMock implements UserManger {

    public User findById(Long id) {
        User user=new User();
        user.setName("流程");
        user.setAge(19);
        user.setId(id);
        return user;
    }
}
