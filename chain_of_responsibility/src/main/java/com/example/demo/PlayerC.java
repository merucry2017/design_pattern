package com.example.demo;

public class PlayerC extends Player {

    /**
     * 构造函数
     */
    public PlayerC(Player successor) {
        this.setSuccessor(successor);
    }

    /**
     * 实现handle方法
     * @param i
     */
    @Override
    public void handle(int i) {
        if (i == 3) {
            System.out.println("PlayerC 喝酒！");
        } else {
            System.out.println("PlayerC 把花向下传");
            next(i);
        }
    }
}
