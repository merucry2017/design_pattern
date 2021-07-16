package com.example.demo.serviceImpl;

import com.example.demo.bean.ShuiJiao;
import com.example.demo.service.Hundun;

public class FoodAdapter extends ShuiJiao implements Hundun {
    @Override
    public void makeHundun() {
        super.makeShuiJiao();
        System.out.println("馄饨");
    }
}
