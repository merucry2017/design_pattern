package com.example.demo;

import com.example.demo.proxy.GamePlayerProxy;
import com.example.demo.service.IGamePlayer;
import com.example.demo.serviceImpl.GamePlayer;

public class ClientDemo {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("李逍遥");
        IGamePlayer proxy = new GamePlayerProxy(player);
        proxy.killBoss();
        proxy.upGrade();
    }
}
