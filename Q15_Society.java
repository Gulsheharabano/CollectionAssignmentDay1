package com.collectionmasterassignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*
 * Assume that there is already  arraylist of members of Society Member{memberid,Wing_flatNo,name}.  
 * Write a program which creates Map where key is Wing_FlatNo and value is 
 * List of all  names of family members 
 */
public class Q15_Society {
	int memberid;
	int Wing_flatNo;
	String name;
	
	public Q15_Society(int memberid, int wing_flatNo, String name) {
		super();
		this.memberid = memberid;
		Wing_flatNo = wing_flatNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Q15_Society [memberid=" + memberid + ", Wing_flatNo=" + Wing_flatNo + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		ArrayList<Q15_Society> al=new ArrayList<>();
		
		al.add(new Q15_Society(1, 101, "gul"));
		al.add(new Q15_Society(1, 102, "akash"));
		al.add(new Q15_Society(1, 103, "neha"));
		al.add(new Q15_Society(1, 102, "rasika"));
		al.add(new Q15_Society(1, 101, "shama"));
		al.add(new Q15_Society(1, 102, "omkar"));
		al.add(new Q15_Society(1, 103, "raj"));
		
		HashMap<Integer, ArrayList<String>> hm=new HashMap<>();
			
		HashSet<Integer> hs=new HashSet<>();
		//Set set=ss.entrySet();
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Q15_Society s1=(Q15_Society) itr.next();
			int fid=s1.Wing_flatNo;
			hs.add(fid);
		}
		
		Iterator itr1=hs.iterator();
		while(itr1.hasNext())
		{
			Integer i=(Integer) itr1.next();
			ArrayList<String> al1=new ArrayList<>();
			
			Iterator itr2=al.iterator();
			while(itr2.hasNext())
			{
				Q15_Society s1=(Q15_Society) itr2.next();
				Integer m1=s1.Wing_flatNo;
				if(i==m1)
				{
					al1.add(s1.name);
				}
			}

			hm.put(i, al1);
		}
		

		System.out.println(hm);

	}

}
