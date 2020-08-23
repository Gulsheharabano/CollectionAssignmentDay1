package com.collectionmasterassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Create a collection to maintain data in sorted order of Movie Rating and if 2 movies have
same rating then according to Theatrename (use Anonymous class for sorting) 
Theatre (Theatreid,Theatrename,location,Movie)
Movie (Movieid,Moviename,Rating)
 */
class Theatre{
	int Theatreid;
	String Theatrename;
	String location;
	Movie m;
	
	public Theatre(int theatreid, String theatrename, String location, Movie m) {
		super();
		Theatreid = theatreid;
		Theatrename = theatrename;
		this.location = location;
		this.m = m;
	}
	
	@Override
	public String toString() {
		return "Theatre [Theatreid=" + Theatreid + ", Theatrename=" + Theatrename + ", location=" + location + ", m="
				+ m + "]";
	}
	
}

public abstract class Q7_Rating implements Comparator<Movie>{

	public static void main(String[] args) {
		Movie m=new Movie(1,"raz", 3);
		Movie m1=new Movie(2,"panga", 4);
		Movie m2=new Movie(3,"abc", 3);
		Movie m3=new Movie(4,"xyz", 2);
		Movie m4=new Movie(5,"pqr", 4);
		
		Theatre t=new Theatre(1, "pvr", "chichwad", m);
		Theatre t1=new Theatre(2, "e-squre", "pimpri", m1);
		Theatre t2=new Theatre(3, "inox", "chichwad", m2);
		Theatre t3=new Theatre(1, "pvr", "chichwad", m3);
		Theatre t4=new Theatre(3, "city pride", "pune", m4);
		
		ArrayList<Theatre> al=new ArrayList<>();
		al.add(t);
		al.add(t1);
		al.add(t2);
		al.add(t3);
		al.add(t4);
		
		System.out.println(al);
		
		Collections.sort(al,new Comparator<Theatre>() {

			@Override
			public int compare(Theatre o1, Theatre o2) {
				if(o1.m.Rating>o2.m.Rating)
				{
					return 1;
				}
				else if(o1.m.Rating == o2.m.Rating)
				{
					return o1.Theatrename.compareTo(o2.Theatrename);
				}
				else
				{
					return -1;
				}

			}
		});
		System.out.println(al);
		
	}

}
