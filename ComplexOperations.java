package com.FlynautSaaS.DuplicatePerson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComplexOperations 
{
	public static Person findMaxAge(Set<Person> set) {
        if (set.isEmpty()) return null;

        Person maxAgePerson = null;
        for (Person person : set) {
            if (maxAgePerson == null || person.getAge() > maxAgePerson.getAge()) {
                maxAgePerson = person;
            }
        }
        return maxAgePerson;
    }

    public static Person findMinAge(Set<Person> set) {
        if (set.isEmpty()) return null;

        Person minAgePerson = null;
        for (Person person : set) {
            if (minAgePerson == null || person.getAge() < minAgePerson.getAge()) {
                minAgePerson = person;
            }
        }
        return minAgePerson;
    }

    public static List<Person> sortByAge(Set<Person> set) {
        List<Person> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });
        return list;
    }

    public static Set<Person> filterByAge(Set<Person> set, int age) {
        Set<Person> filteredSet = new HashSet<>();
        for (Person person : set) {
            if (person.getAge() > age) {
                filteredSet.add(person);
            }
        }
        return filteredSet;
    }
}
