package com.example.demo;

public class Test {

    public static void main(String[] args) {
        Color color = new Green();
        AbstractShape shape = new Square(color);
        shape.draw();
    }
}
