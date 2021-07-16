package com.example.demo;

public class OtherObserver implements ClickableObserver {
    @Override
    public void clicked(Clickable clickable) {
        System.out.println("其他业务观察者...");
    }
}
