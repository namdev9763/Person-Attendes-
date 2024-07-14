package com.FlynautSaaS.DuplicatePerson;

import java.util.HashSet;
import java.util.Set;

public class Conference {

	private Set<Person> attendees;

    public Conference() {
        this.attendees = new HashSet<>();
    }

    public boolean addAttendee(Person person) {
        return attendees.add(person);
    }

    public boolean removeAttendee(Person person) {
        return attendees.remove(person);
    }

    public Set<Person> findDuplicateAttendees() {
        Set<Person> duplicates = new HashSet<>();
        Set<Integer> seenIds = new HashSet<>();
        Set<Integer> duplicateIds = new HashSet<>();

        for (Person attendee : attendees) {
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
        for (Person attendee : attendees) {
            System.out.println(attendee);
        }
    }
}
