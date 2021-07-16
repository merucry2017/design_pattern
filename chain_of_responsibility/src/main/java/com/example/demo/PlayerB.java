package com.example.demo;

public class PlayerB extends Player {

    /**
     * 构造函数
     */
    public PlayerB(Player successor) {
        this.setSuccessor(successor);
    }

    /**
     * 实现handle方法
     * @param i
     */
    @Override
    public void handle(int i) {
        if (i == 2) {
            System.out.println("PlayerB 喝酒！");
        } else {
            System.out.println("PlayerB 把花向下传");
            next(i);
        }
    }
}
