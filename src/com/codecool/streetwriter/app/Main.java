package com.codecool.streetwriter.app;

import com.codecool.streetwriter.Street;
import com.codecool.streetwriter.house.House;
import com.codecool.streetwriter.house.Person;

public class Main {

    public static void main(String[] args) {
        // Object creation kossuth12 from class House
        House kossuth12 = new House(12);
        // Object creation kossuth14 from class House
        House kossuth14 = new House(14);
        // Object creation
        Street kossuthStreet = new Street("Kossuth");
        // Object creation
        Street petofiStreet = new Street("Petofi");
        // Street instance has a House
        kossuthStreet.build(kossuth12);
        // Street instance has a House
        kossuthStreet.build(kossuth14);
        if (!kossuthStreet.rename("Square of 56ers")) {
            System.out.println("Great! Rename validation is working! :) ");
        }
        Person richieRich = new Person("Richie Rich");// Object richieRich creation
        kossuth12.moveIn(richieRich);//Object richieRich has moved in on Kossuth 12
        richieRich.buy(kossuth12);// Object richieRich has bought a hause on kosstuh 12
        richieRich.buy(kossuth14);// Object richieRich has bought a hause on kosstuh 14
        Person residentEvil = new Person("Resident Evil");// Object residentEvil creation
        kossuth14.moveIn(residentEvil);//Object residenEvil has moved in

        System.out.println("Check object relationships here! :)");
    }
}
