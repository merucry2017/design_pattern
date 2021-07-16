package com.example.demo.bean;

import com.example.demo.prototype.Fruit;

public class Apple implements Fruit {

    private int treeAge;

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }

    @Override
    public void grow() {
        System.out.println("苹果生长...");
    }

    @Override
    public void harvest() {
        System.out.println("苹果收获");
    }

    @Override
    public void plant() {
        System.out.println("苹果栽种");
    }
}
