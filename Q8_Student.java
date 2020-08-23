package com.collectionmasterassignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Consider an array of Student 
Student (int sid, String sname, List<String> hobby)
From this list create a Map<String,List<Student>> where key is hobby name and list of
student objects having same hobby. Also find out most common hobby among students
 */
public class Q8_Student {
	int sid;
	String sname;
	ArrayList<String> hobby;

	public Q8_Student(int id, String name, ArrayList<String> hobby) {
		this.sid = id;
		this.sname = name;
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Q8_Student [sid=" + sid + ", sname=" + sname + ", hobby=" + hobby + "]";
	}

	public static void main(String[] args) {
		ArrayList<Q8_Student> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();

			ArrayList<String> al = new ArrayList<>();

			for (int j = 0; j < 2; j++) 
			{
				System.out.println("Enter hobby");
				al.add(sc.next());
			}
			a.add(new Q8_Student(id, name, al));
		}

		System.out.println(a);

		HashMap<String, ArrayList<Q8_Student>> hm = new HashMap<>();

		for (int j = 0; j < a.size(); j++) 
		{
			Q8_Student s1 = (Q8_Student) a.get(j);
			for (int k = 0; k < s1.hobby.size(); k++) 
			{
				String h = s1.hobby.get(k);
				ArrayList<Q8_Student> al = new ArrayList<>();
				
				for (int i = 0; i < a.size(); i++) 
				{
					Q8_Student s = (Q8_Student) a.get(i);
					if (s.hobby.contains(h)) 
					{
						al.add(s);
					}
				}

				hm.put(h, al);
			}
		}

		System.out.println(hm);

	}

}
