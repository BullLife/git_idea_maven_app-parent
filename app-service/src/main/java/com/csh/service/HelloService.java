package com.csh.service;

import com.csh.dao.HelloName;

/**
 * Created by Administrator on 2018/7/1.
 */
public class HelloService {
    public void m1(String name){
        HelloName helloName = new HelloName();
        helloName.hello(name);
    }
}
