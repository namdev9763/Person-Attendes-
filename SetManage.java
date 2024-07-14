package com.FlynautSaaS.DuplicatePerson;

import java.util.*;

public class SetManage
{
	public static Set<Person> union(Set<Person> set1, Set<Person> set2) {
		HashSet<Person> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static Set<Person> intersection(Set<Person> set1, Set<Person> set2) {
        Set<Person> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    public static Set<Person> difference(Set<Person> set1, Set<Person> set2) {
        Set<Person> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        return differenceSet;
    }

    public static Set<Person> differenceReverse(Set<Person> set1, Set<Person> set2) {
        return difference(set2, set1);
    }
}
