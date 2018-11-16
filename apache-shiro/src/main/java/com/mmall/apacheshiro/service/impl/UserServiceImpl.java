package com.mmall.apacheshiro.service.impl;

import com.mmall.apacheshiro.mapper.UserMapper;
import com.mmall.apacheshiro.model.User;
import com.mmall.apacheshiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/11/16:09:02
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
