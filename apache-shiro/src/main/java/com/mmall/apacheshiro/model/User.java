package com.mmall.apacheshiro.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/11/16:08:53
 */
@Data
public class User {
    private Integer uid;

    private String username;

    private String password;

    private Set<Role> roles = new HashSet<>();
}
