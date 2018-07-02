package com.csh.contoller;

import com.csh.service.HelloService;

/**
 * Created by Administrator on 2018/7/1.
 */
public class helloController {

    public static void main(String[] args) {
        HelloService helloService = new HelloService();
        helloService.m1("张三");
    }
}
