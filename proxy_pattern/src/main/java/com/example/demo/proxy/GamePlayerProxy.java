package com.example.demo.proxy;

import com.example.demo.service.IGamePlayer;

import java.util.Date;

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer player = null;

    public  GamePlayerProxy(IGamePlayer player) {
        this.player = player;
    }

    /**
     * 记录打怪时间
     */
    private void log() {
        System.out.println("打怪时间"+new Date().toString());
    }

    @Override
    public void killBoss() {
        this.log();
        player.killBoss();
    }

    @Override
    public void upGrade() {
        player.upGrade();
        this.count();
    }

    /**
     * 计时
     */
    private void count() {
        System.out.println("消耗时间50小时");
    }
}
