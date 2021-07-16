package com.example.demo;

import com.example.demo.service.Hundun;
import com.example.demo.serviceImpl.FoodAdapter;

public class ClientDemo {

    public static void main(String[] args) {
        Hundun hundun = new FoodAdapter();
        hundun.makeHundun();
    }
}
