package com.example.demo;

public class PlayerA extends Player {

    /**
     * 构造函数
     */
    public PlayerA(Player successor) {
        this.setSuccessor(successor);
    }

    /**
     * 实现handle方法
     * @param i
     */
    @Override
    public void handle(int i) {
        if (i == 1) {
            System.out.println("PlayerA 喝酒！");
        } else {
            System.out.println("PlayerA 把花向下传");
            next(i);
        }
    }
}
