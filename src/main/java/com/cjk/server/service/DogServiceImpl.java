package com.cjk.server.service;

/**
 * Created by cjk on 2023/9/5.
 **/
public class DogServiceImpl implements DogService {
    @Override
    public String dog(String name) {
        return name + " is dog";
    }
}
