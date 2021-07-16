package com.example.demo;

public class Test {

    public static void main(String[] args) {
        MarriageAgency agency = new MarriageAgencyImpl();
        Person m1 = new Man("A",20,18, agency);
        Person m2 = new Man("B",27,25,agency);
        Person w1 = new Woman("C",25,27,agency);
        Person w2 = new Woman("D",20,22,agency);

        m1.findPartner();
        m2.findPartner();
    }
}
