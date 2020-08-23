package com.collectionmasterassignment;
/*
 * An map contains student object as a key and list of courses he has enrolled in. [1M]
e.g. map<student , list(course)>  
Create another map in which course id is a key and list of student objects of that 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

class Student
{
	String sname;


	public Student(String sname) {
		super();
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + "]";
	}
	
}
public class Q10_Course {
	int cid;
	String cname;
	public Q10_Course(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Q10_Course [cid=" + cid + ", cname=" + cname + "]";
	}
	
	public static void main(String[] args) {
		HashMap<Student, ArrayList<Q10_Course>> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
	
		int cid;
		for (int i = 0; i < 2; i++) 
		{			
			System.out.println("Enter Student name");
			String key = sc.next();
			ArrayList<Q10_Course> al = new ArrayList<>();

			for (int j = 0; j < 1; j++) 
			{
				System.out.println("enter course id");
				cid = sc.nextInt();
				System.out.println("enter course name");
				String name = sc.next();
				
				al.add(new Q10_Course(cid, name));
			}
			hm.put(new Student(key), al);
		}
		System.out.println(hm);
		
		
		HashMap<Integer, ArrayList<Student>> hm1 = new HashMap<>();
			
		HashSet<Integer> temp= new HashSet<>();
		
		Set s= hm.entrySet();
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			Map.Entry e=(Entry) itr.next();
			
			ArrayList<Q10_Course> al=(ArrayList<Q10_Course>) e.getValue();
			
			for(int i=0;i<al.size();i++) {
				Integer j=al.get(i).cid;
				temp.add(j);
			}
		}
		
		Iterator itr2=temp.iterator();
		Set s1=hm.entrySet();
		
		while(itr2.hasNext()) {
			Integer i=(Integer) itr2.next();
			ArrayList<Student> alstudent=new ArrayList<>();

			Iterator itr1=s1.iterator();
			
			while(itr1.hasNext()) {
				Map.Entry e=(Entry) itr1.next();
				ArrayList<Q10_Course> al=(ArrayList<Q10_Course>) e.getValue();
				Student s2=(Student) e.getKey();
				
				for(int j=0;j<al.size();j++) {
					Integer id=al.get(j).cid;
					if(id==i) {
						alstudent.add(s2);
						break;
					}
				}
			}
			
			hm1.put(i, alstudent);
		}
		
		System.out.println(hm1);
	}

}
