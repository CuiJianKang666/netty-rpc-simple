package com.cjk.server.service;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String msg) {
        return "你好, " + msg;
    }

    @Override
    public String good(String string) {
        return string + " is good";
    }
}
