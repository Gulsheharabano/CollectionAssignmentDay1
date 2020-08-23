package com.collectionmasterassignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/*
 * There is a HashSet which has student objects. Create two arraylists from this
hashset. In one arraylist called ‘placedStudents’ insert all students who have
been placed and in another arraylist ‘unplacedStudents’
Student class--Fields
studid, Name, Qualification, yearOfpassing, placed(true/false)
 */
public class Q19_Student {
	int studid;
	String Name;
	String Qualification;
	int yearOfpassing;
	boolean placed;

	public Q19_Student(int studid, String name, String qualification, int yearOfpassing, boolean placed) {
		super();
		this.studid = studid;
		Name = name;
		Qualification = qualification;
		this.yearOfpassing = yearOfpassing;
		this.placed = placed;
	}

	@Override
	public String toString() {
		return "Q19_Student [studid=" + studid + ", Name=" + Name + ", Qualification=" + Qualification
				+ ", yearOfpassing=" + yearOfpassing + ", placed=" + placed + "]";
	}


	public static void main(String[] args) {
		HashSet<Q19_Student> hs=new HashSet<>();
		
		hs.add(new Q19_Student(1, "Gul", "MCA", 2019, false));
		hs.add(new Q19_Student(2, "rasika", "NAC", 2017, true));
		hs.add(new Q19_Student(3, "neha", "MBA", 2019, false));
		hs.add(new Q19_Student(4, "priyanka", "BE", 2018, true));
		hs.add(new Q19_Student(5, "raj", "MCA", 2017, true));
		hs.add(new Q19_Student(6, "raza", "MBA", 2019, false));
		
		ArrayList<Q19_Student> al1=new ArrayList<>();
		ArrayList<Q19_Student> al2=new ArrayList<>();
		
		for(Q19_Student ee:hs)
		{
			if(ee.placed==true)
			{
				al1.add(ee);
			}
			else if(ee.placed==false)
			{
				al2.add(ee);
			}
			
		}

		System.out.println(al1);
		System.out.println(al2);
	}

}
