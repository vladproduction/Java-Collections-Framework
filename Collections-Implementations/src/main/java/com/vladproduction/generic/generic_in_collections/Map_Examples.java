package com.vladproduction.generic.generic_in_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Examples {
    public static void main(String[] args) {

        Person donDraper = new Person("Don Draper", 20);
        Person peggyOlson = new Person("Peggy Olson", 25);
        Person bertCooper = new Person("Bert Cooper", 22);

        // Generic Type with two type parameters
        Map<String, Person> personByName = new HashMap<>();

        // generic put method - parameterized by both key and value
        personByName.put(donDraper.getName(), donDraper);
        personByName.put(peggyOlson.getName(), peggyOlson);
        personByName.put(bertCooper.getName(), bertCooper);

        // Point out hashcode/equals is used here as well
        System.out.println("Don is " + personByName.get("Don Draper"));

        // foreach key
        for (String name : personByName.keySet()) {
            System.out.println(name);
        }

        // foreach value
        for (Person person : personByName.values()) {
            System.out.println(person);
        }

        // foreach entry - again two generic parameters
        for (Entry<String, Person> entry : personByName.entrySet()) {
            System.out.println(entry);
        }
    }
}
