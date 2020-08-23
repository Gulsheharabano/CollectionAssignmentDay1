package com.collectionmasterassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * Assume that there is already aarraylist of Customer objects. Customer { intcid , String name ,
int[] items }. Write a program which creates hashset of customer objects. If there are
multiple customer object for same customer in arraylist ,then items should be added to previous 
customer’s items.                                                                                         
Once set is created sort that set based on no. of items purchased by that customer.
Customer with maximum items should be first.
 */
public class Q5_Customer {
	int cid;
	String name;
	int items;

	public Q5_Customer(int cid, String name, int items) {
		super();
		this.cid = cid;
		this.name = name;
		this.items = items;
	}

	@Override
	public String toString() {
		return "Q5_Customer [cid=" + cid + ", name=" + name + ", items=" + items + "]";
	}



	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Q5_Customer> cust= new ArrayList<>();
		
		cust.add(new Q5_Customer(101, "abc", 8));
		cust.add(new Q5_Customer(102, "skj", 6));
		cust.add(new Q5_Customer(101, "abc", 3));
		cust.add(new Q5_Customer(104, "xyz", 7));
		cust.add(new Q5_Customer(103, "pqr", 11));
		cust.add(new Q5_Customer(103, "pqr", 9));
		cust.add(new Q5_Customer(101, "abc", 2));
		
		HashSet<Q5_Customer> hs=new HashSet<>();
		
		for(int i=0;i<cust.size();i++) {
			
			int item1=cust.get(i).items;
			int id=cust.get(i).cid;
			String n=cust.get(i).name;
			
			for(int j=i+1;j<cust.size();j++) {
				int item2=cust.get(j).items;
				int id1=cust.get(j).cid;
				
				if(id==id1) {
					item1=item1+item2;
					cust.remove(j);
					j--;
				}
			}                 
			
			hs.add(new Q5_Customer(id,n, item1));
		}
				
		TreeSet<Q5_Customer> ts = new TreeSet<>(new Comparator<Q5_Customer>(){

			@Override
			public int compare(Q5_Customer o1, Q5_Customer o2) {
			
				return o2.items-o1.items;
			}
			
        });
 
        // add HashSet elements to TreeSet
        ts.addAll(hs);
        System.out.println("After Asending order = ");
        System.out.println(ts);
	}

}
