package com.shucan.example.provicer;

import com.shucan.example.common.service.UserService;
import com.shucan.learnrpc.registry.LocalRegistry;
import com.shucan.learnrpc.server.HttpServer;
import com.shucan.learnrpc.server.VertxHttpServer;

/**
 * 简易服务提供者示例
 * @author: ningkun
 * @date: 2024-03-18 14:40
 */
public class EasyProviderExample {

    public static void main(String[] args) {
        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);
        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
