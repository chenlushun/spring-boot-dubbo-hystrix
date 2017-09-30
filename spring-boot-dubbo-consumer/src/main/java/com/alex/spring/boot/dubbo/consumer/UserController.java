package com.alex.spring.boot.dubbo.consumer;

import com.alex.spring.boot.dubbo.provider.UserManger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex
 **/
@RestController
public class UserController {

    @Autowired
    private UserManger userManger;

    @GetMapping("/{id}")
    public Object index(@PathVariable("id") Long id) {
        return userManger.findById(id);
    }
}
