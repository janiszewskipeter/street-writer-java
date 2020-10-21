package com.codecool.streetwriter.house;



import java.util.HashSet;
import java.util.Set;

public class House {
    private int address;
    private Person owner;
    private Set<Person> residents = new HashSet<>();

    public House(int address) {
        this.address = address;
    }

    public void moveIn(Person resident) {
        residents.add(resident);
    }

    public void purchaseBy(Person person) {
        owner = person;
    }
}
