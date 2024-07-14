package com.FlynautSaaS.DuplicatePerson;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PerformanceAnalysis {

	public static void main(String[] args) {
        Set<Person> hashSet = new HashSet<>();
        Set<Person> linkedHashSet = new LinkedHashSet<>();
        final int ELEMENTS_COUNT = 1000000;

        // Adding elements
        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            hashSet.add(new Person(i, "Person" + i, i % 100));
        }
        long endTime = System.nanoTime();
        System.out.println("HashSet add time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedHashSet.add(new Person(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet add time: " + (endTime - startTime) / 1e6 + " ms");

        // Contains elements
        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            hashSet.contains(new Person(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("HashSet contains time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedHashSet.contains(new Person(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet contains time: " + (endTime - startTime) / 1e6 + " ms");

        // Remove elements
        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            hashSet.remove(new Person(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("HashSet remove time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedHashSet.remove(new Person(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet remove time: " + (endTime - startTime) / 1e6 + " ms");
    }
}
