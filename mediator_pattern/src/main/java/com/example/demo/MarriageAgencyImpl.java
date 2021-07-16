package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class MarriageAgencyImpl implements MarriageAgency {
    List<Man> men = new ArrayList<>();
    List<Woman> women = new ArrayList<>();
    @Override
    public void pair(Person person) {
        if (person.sex == Person.Sex.MALE) {
            for (Woman w: women) {
                if (w.age == person.requestAge) {
                    System.out.println(person.name +"配对"+w.name);
                    return;
                }

            }
        } else if (person.sex == Person.Sex.FEMALE) {
            for (Man m : men) {
                if (m.age == person.requestAge) {
                    System.out.println(person.name +"配对"+m.name);
                }
            }
        }
        System.out.println("未匹配");
    }

    @Override
    public void register(Person person) {
        if (person.sex == Person.Sex.MALE) {
            men.add((Man)person);
        } else if (person.sex == Person.Sex.FEMALE) {
            women.add((Woman)person);
        }
    }
}
