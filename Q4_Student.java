package com.collectionmasterassignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * A hashmap contains information about students and his marks. Student object is key and marks is value. 
 * Write a method to create 2 hashset which will have passed students of java course and 
 * passed students of angular course. Passing marks for java is 50 and passing marks for angular is 60. 
 * Student class is as follows. Student { intsid , String name, String course }
 */
public class Q4_Student {
	int sid;
	String name;
	String course;

	public Q4_Student(int sid, String name, String course) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Q4_Student [sid=" + sid + ", name=" + name + ", course=" + course + "]";
	}


	public static void main(String[] args) {
		HashMap<Q4_Student, Integer> hm=new HashMap<>();
		
		hm.put(new Q4_Student(1, "gul", "java"), 50);
		hm.put(new Q4_Student(1, "raj", "angular"), 60);
		hm.put(new Q4_Student(1, "rasika", "java"), 40);
		hm.put(new Q4_Student(1, "neha", "angular"), 77);
		hm.put(new Q4_Student(1, "deep", "java"), 70);
		hm.put(new Q4_Student(1, "ranjeet", "angular"), 55);
		
		HashSet<Q4_Student> hs1=new HashSet<>();
		HashSet<Q4_Student> hs2=new HashSet<>();
		
		for(Map.Entry<Q4_Student, Integer> ee:hm.entrySet())
		{
			if(ee.getValue()>=50 && ee.getKey().course.equals("java"))
			{
				hs1.add(ee.getKey());
			}
			else if(ee.getValue()>=60 && ee.getKey().course.equals("angular"))
			{
				hs2.add(ee.getKey());
			}
		}
		System.out.println(hs1);
		System.out.println(hs2);

	}

}
