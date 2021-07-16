package com.example.demo;

public class Test {

    public static void main(String[] args) {
        Button button = new Button();
        button.color = "白色";
        button.x = 0;
        button.y = 0;
        button.addClickableObserver(new ChangeColorObserver());
        button.addClickableObserver(new ChangeCoordinateObserver());
        button.addClickableObserver(new OtherObserver());
        button.click();
        System.out.println(button);
    }
}
