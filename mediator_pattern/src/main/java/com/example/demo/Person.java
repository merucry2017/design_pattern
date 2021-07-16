package com.example.demo;

public abstract class Person {
    String name;
    int age;
    Sex sex;
    int requestAge;
    MarriageAgency agency;

    enum Sex {
        MALE, FEMALE;
    }

    public Person(String name, int age, Sex sex, int requestAge, MarriageAgency agency) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.requestAge = requestAge;
        this.agency = agency;
        /**
         * 注册
         */
        agency.register(this);
    }

    /**
     * 寻找对象
     */
    public void findPartner() {
        agency.pair(this);
    }
}
