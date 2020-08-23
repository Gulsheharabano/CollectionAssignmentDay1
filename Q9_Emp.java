package com.collectionmasterassignment;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Write a Program in Java, You have an Employee class 
class Employee{ 
String name; 
int eid, 
int mgrid; 
} 
Every manager is also employee. So create an arraylist of 5 Emp and 
print all Employee along with their Manager name.
 */
public class Q9_Emp {
	int eid;
	String name;
	int mgrid;

	public Q9_Emp(int eid, String name, int mgrid) {
		super();
		this.eid = eid;
		this.name = name;
		this.mgrid = mgrid;
	}

	public static void main(String[] args) {
		ArrayList<Q9_Emp> al=new ArrayList<>();
		al.add(new Q9_Emp(1,"Gul",2));
		al.add(new Q9_Emp(2,"amit",4));
		al.add(new Q9_Emp(3,"rasika",4));
		al.add(new Q9_Emp(4,"priyanka",2));
		al.add(new Q9_Emp(5,"ranjeet",1));
		al.add(new Q9_Emp(6,"subhrat",2));
		
		HashMap<String, String>  hm=new  HashMap<>();
		
		for (int j = 0; j < al.size(); j++) 
		{
			String m = null;
			Q9_Emp s1 = (Q9_Emp) al.get(j);
			   String h=s1.name;
				for (int i = 0; i < al.size(); i++) 
				{
					Q9_Emp s = (Q9_Emp) al.get(i);
					if (s.eid==s1.mgrid) 
					{
						m=s.name;
					}
				}
				hm.put(h, m);
				System.out.println(h+" : "+m);
		}
		
      System.out.println(hm);
	}
}
