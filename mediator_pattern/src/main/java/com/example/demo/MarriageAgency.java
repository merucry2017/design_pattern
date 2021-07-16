package com.example.demo;

public interface MarriageAgency {
    /**
     * 为person配对
     * @param person
     */
    void pair(Person person);
    /**
     * 注册会员
     */
    void register(Person person);
}
