package com.shucan.example.common.service;

import com.shucan.example.common.model.User;

/**
 * 用户服务
 * @author: ningkun
 * @date: 2024-03-18 11:26
 */
public interface UserService {

    /**
     * 获取用户
     * @param user
     * @return
     */
    User getUser(User user);
}
