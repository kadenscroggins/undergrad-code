// CS1: Program 5
// Sorting
// Semester: 1
//
// Kaden Scroggins
// CRN 60992
//
// Defines the object type "Patient"
//  used for sorting patient records

import java.util.*;

class PatientLastComparator implements Comparator<Patient>
{
	public int compare(Patient a, Patient b)
	{
		String alast = a.last;
		String blast = b.last;
		return alast.compareTo(blast);
	}
}

class PatientFirstComparator implements Comparator<Patient>
{
	public int compare(Patient a, Patient b)
	{
		String afirst = a.first;
		String bfirst = b.first;
		return afirst.compareTo(bfirst);
	}
}

class PatientAgeComparator implements Comparator<Patient>
{
	public int compare(Patient a, Patient b)
	{
		return a.age - b.age;
	}
}

class PatientRoomComparator implements Comparator<Patient>
{
	public int compare(Patient a, Patient b)
	{
		return a.room - b.room;
	}
}

public class Patient 
{
	// Holds data for a patient's first name, last name, age, and room number
	public String last;
	public String first;
	public int age;
	public int room;

	public Patient(String last, String first, int age, int room)
	{
		this.last = last;
		this.first = first;
		this.age = age;
		this.room = room;
	}

	public String toString()
	{
		// Returns a formatted string of what the Patient object contains
		return String.format("%-12s%-12s%3d%6d", last, first, age, room);
	}
}