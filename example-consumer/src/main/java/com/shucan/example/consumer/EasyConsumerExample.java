package com.shucan.example.consumer;

import com.shucan.example.common.model.User;
import com.shucan.example.common.service.UserService;
import com.shucan.learnrpc.proxy.ServiceProxyFactory;

/**
 * 简易服务消费者示例
 * @author: ningkun
 * @date: 2024-03-18 14:44
 */
public class EasyConsumerExample {
    public static void main(String[] args) {
        /*// 静态代理
        UserService userService = new UserServiceProxy();*/

        // 动态代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("shucan");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}
