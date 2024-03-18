package com.shucan.example.provicer;

import com.shucan.example.common.model.User;
import com.shucan.example.common.service.UserService;

/**
 * 用户实现服务类
 * @author: ningkun
 * @date: 2024-03-18 14:38
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
