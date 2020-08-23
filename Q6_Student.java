package com.collectionmasterassignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*
 * WAP wherein Set<Student>containing { introllno , String name , intmarks } are changed to
Map where key will be marks and value will be List of RollNos where all those students 
who have same marks are together.
 */
public class Q6_Student {
	int rollno;
	String name;
	int marks;
	
	public Q6_Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Q6_Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {
		Set<Q6_Student> ss=new HashSet<>();
		
		ss.add(new Q6_Student(1, "gul", 77));
		ss.add(new Q6_Student(2, "raj", 88));
		ss.add(new Q6_Student(3, "rasika", 70));
		ss.add(new Q6_Student(4, "neha", 66));
		ss.add(new Q6_Student(5, "deep", 55));
		ss.add(new Q6_Student(6, "omkar", 66));
		
		HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
		HashSet<Integer> hs=new HashSet<>();
		//Set set=ss.entrySet();
		Iterator itr=ss.iterator();
		while(itr.hasNext())
		{
			Q6_Student b1=(Q6_Student) itr.next();
			int marks=b1.marks;
			hs.add(marks);
		}
		
		
		Iterator itr1=hs.iterator();
		while(itr1.hasNext())
		{
			Integer i=(Integer) itr1.next();
			ArrayList<Integer> al=new ArrayList<>();
			
			Iterator itr2=ss.iterator();
			while(itr2.hasNext())
			{
				Q6_Student stud= (Q6_Student) itr2.next();
				Integer m1=stud.marks;
				if(i==m1)
				{
					al.add(stud.rollno);
				}
			}

			hm.put(i, al);
		}
		

		System.out.println(hm);
	}

}
