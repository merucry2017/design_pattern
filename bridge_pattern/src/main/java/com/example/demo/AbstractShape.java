package com.example.demo;

/**
 * 图形
 */
public abstract class AbstractShape {
    Color color;
    public AbstractShape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
