package com.collectionmasterassignment;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * Create two Set of students objects where insertion order in maintained. 
 * Now accept Studentid from user and check whether in both sets have student 
 * with given id at same position
 */
public class Q13_Student {
	int sid;
	String name;

	public Q13_Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Q13_Student [sid=" + sid + ", name=" + name + "]";
	}

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		
		LinkedHashSet<Q13_Student> hs= new LinkedHashSet<>();
		hs.add(new Q13_Student(1, "neha"));
		hs.add(new Q13_Student(2, "gul"));
		hs.add(new Q13_Student(3, "zara"));
		hs.add(new Q13_Student(4, "pooja"));
		hs.add(new Q13_Student(5, "raj"));
		System.out.println(hs);
		
		LinkedHashSet<Q13_Student> hs1= new LinkedHashSet<>();
		
		hs1.add(new Q13_Student(4, "pooja"));
		hs1.add(new Q13_Student(5, "raj"));
		hs1.add(new Q13_Student(3, "zara"));
		hs1.add(new Q13_Student(1, "neha"));
		hs1.add(new Q13_Student(2, "gul"));
		System.out.println(hs1);
		
		System.out.println("Enter student id");
		int id=sc.nextInt();
		
		Iterator<Q13_Student> itr=hs.iterator();
		int cnt=0;

		while(itr.hasNext()) {
			Q13_Student s=(Q13_Student) itr.next();
			cnt++;
			if(s.sid==id) {
				break;
			}
		}
		
		Iterator<Q13_Student> itr1=hs1.iterator();
		int cnt1=0;
		
		while(itr1.hasNext()) {
			Q13_Student s1=(Q13_Student) itr1.next();
			cnt1++;
			if(s1.sid==id) {
				break;
			}
		}
		
		if(cnt1==cnt) {
			System.out.println("Same position");
		}
		
		else {
			System.out.println("position not same");
		}

	}

}
