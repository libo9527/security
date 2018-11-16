package com.mmall.apacheshiro.service;

import com.mmall.apacheshiro.model.User;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/11/16:09:01
 */
public interface UserService {
    User findByUsername(String username);
}
