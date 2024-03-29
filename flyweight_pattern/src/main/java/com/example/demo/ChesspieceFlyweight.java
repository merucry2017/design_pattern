package com.example.demo;

/**
 * 具体享元对象
 */
public class ChesspieceFlyweight implements Chesspiece {
    /**
     * 内部状态
     */
    private String color;

    public ChesspieceFlyweight(String color) {
        this.color = color;
    }

    @Override
    public void put(int x, int y) {
        System.out.println("在("+x+","+y+")位置放了一个"+color+"子");
    }
}
