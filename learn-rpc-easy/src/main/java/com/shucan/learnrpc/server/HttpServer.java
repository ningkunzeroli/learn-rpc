package com.shucan.learnrpc.server;

/**
 * HTTP 服务器接口
 * @author: ningkun
 * @date: 2024-03-18 14:50
 */
public interface HttpServer {

    /**
     * 启动服务器
     *
     * @param port
     */
    void doStart(int port);
}
