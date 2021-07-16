package com.example.demo.bean;

import com.example.demo.prototype.Fruit;

public class Grape implements Fruit {
    private Boolean seedless;

    public Boolean getSeedless() {
        return seedless;
    }

    public void setSeedless(Boolean seedless) {
        this.seedless = seedless;
    }

    @Override
    public void grow() {
        System.out.println("葡萄生长...");
    }

    @Override
    public void harvest() {
        System.out.println("葡萄收获");
    }

    @Override
    public void plant() {
        System.out.println("葡萄栽种");
    }
}
