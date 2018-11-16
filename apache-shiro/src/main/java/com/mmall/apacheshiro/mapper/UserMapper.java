package com.mmall.apacheshiro.mapper;

import com.mmall.apacheshiro.model.User;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/11/16:09:00
 */
public interface UserMapper {

    User findByUsername(String username);
}
