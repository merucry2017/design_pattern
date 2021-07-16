package com.example.demo;

/**
 * 正方形
 */
public class Square extends AbstractShape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("使用"+color.getColor()+"正方形");
    }
}
