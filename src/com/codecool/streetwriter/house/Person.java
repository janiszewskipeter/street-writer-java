package com.codecool.streetwriter.house;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private String name;
    private Set<House> properties = new HashSet<>();

    public Person(String s) {
        this.name = s;
    }

    public void buy(House house) {
        properties.add(house);
        house.purchaseBy(this);
    }
}
