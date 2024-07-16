package com.FlynautSaaS.DuplicatePerson;

import java.util.List;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) 
	{
		Conference conference = new Conference();

        // Add some attendees
		 conference.addAttendee(new Person(1, "Somu", 30));
	        conference.addAttendee(new Person(2, "Gomu", 25));
	        conference.addAttendee(new Person(3, "Tomu", 35));
	        conference.addAttendee(new Person(1, "Gomu", 30)); 
	        
	        // Print all attendees
	        System.out.println("All Attendees:");
	        conference.printAllAttendees(); 

        // Find duplicate attendees
        List<Person> duplicates = conference.findDuplicateAttendees();
        System.out.println("Duplicate Attendees: " + duplicates);

        // List unique attendees
        Set<Person> uniqueAttendees = conference.listUniqueAttendees();
        System.out.println("Unique Attendees: " + uniqueAttendees);

        // Find attendees in a specific age range
        Set<Person> attendeesInRange = conference.findAttendeesInRange(25, 35);
        System.out.println("Attendees in Range 25-35: " + attendeesInRange);
	}

}
