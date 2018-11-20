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
public class Role {
    private Integer rid;

    private String rname;

    private Set<Permission> permissions = new HashSet<>();

    private Set<User> users = new HashSet<>();
}
