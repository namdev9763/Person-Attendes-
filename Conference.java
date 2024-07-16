package com.FlynautSaaS.DuplicatePerson;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Conference {

	private Set<Person> attendees;
	private List<Person> list=new ArrayList<>();
    public Conference() {
        this.attendees = new HashSet<>();
    }
    public boolean addAttendee(Person person) {
    		list.add(person);
        return attendees.add(person);
        
    }

    public boolean removeAttendee(Person person) {
        return attendees.remove(person);
    }

    public List<Person> findDuplicateAttendees() {
        Set<Integer> seenIds = new HashSet<>();
        Set<Integer> duplicateIds = new HashSet<>();
        List<Person> duplicates = new ArrayList<>();

        for (Person attendee : list) {
            if (!seenIds.add(attendee.getId())) {
                duplicateIds.add(attendee.getId());
            }
        }

        for (Person attendee : attendees) {
            if (duplicateIds.contains(attendee.getId())) {
                duplicates.add(attendee);
            }
        }

        return duplicates;
    }

    public Set<Person> listUniqueAttendees() {
        return new HashSet<>(attendees);
    }

    public Set<Person> findAttendeesInRange(int minAge, int maxAge) {
        Set<Person> result = new HashSet<>();
        for (Person attendee : attendees) {
            if (attendee.getAge() >= minAge && attendee.getAge() <= maxAge) {
                result.add(attendee);
            }
        }
        return result;
    }
    public void printAllAttendees() {
        for (Person print: list) {
            System.out.println(print);
        }
    }
}
