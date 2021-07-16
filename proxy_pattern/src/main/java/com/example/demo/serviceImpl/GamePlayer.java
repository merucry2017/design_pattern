package com.example.demo.serviceImpl;

import com.example.demo.service.IGamePlayer;

public class GamePlayer implements IGamePlayer {
    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "打怪!");
    }

    @Override
    public void upGrade() {
        System.out.println(this.name + "升级!");
    }
}
