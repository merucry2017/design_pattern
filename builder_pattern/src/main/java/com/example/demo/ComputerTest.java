package com.example.demo;

import com.example.demo.serviceImpl.ComputerDirector;
import com.example.demo.util.Computer;

public class ComputerTest {

    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        Computer t410 = director.constructT410();
        System.out.println(t410);
        System.out.println("----------");
        Computer x201 = director.constructX201();
        System.out.println(x201);
    }
}
