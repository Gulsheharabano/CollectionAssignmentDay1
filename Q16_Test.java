package com.collectionmasterassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Consider an ArrayList<Test>and  test has  {tid,sid,int marks[]} .
 * Create a Set<Student> Student{sid,totalmarks}  from the list and sort the set
 * in descending order of totalmarks
 */
class Studenttest
{
	int sid;
	int totalmarks;
	public Studenttest(int sid, int totalmarks) {
		super();
		this.sid = sid;
		this.totalmarks = totalmarks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", totalmarks=" + totalmarks + "]";
	}
	
}
public class Q16_Test {
	int tid;
	int sid;
	int marks[];

	public Q16_Test(int tid, int sid, int[] marks) {
		super();
		this.tid = tid;
		this.sid = sid;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Q16_Test [tid=" + tid + ", sid=" + sid + ", marks=" + Arrays.toString(marks) + "]";
	}

	public static void main(String[] args) {
		ArrayList<Q16_Test> al=new ArrayList<>();
		
		int m1[]= {38,44,56};
		al.add(new Q16_Test(101, 1, m1));
		
		int m2[]= {55,66,50};
		al.add(new Q16_Test(101, 2, m2));
		
		int m3[]= {60,40,77};
		al.add(new Q16_Test(101, 3, m3));
		
		Set<Studenttest> stud=new HashSet<>();
		int total=0;
		for (int j = 0; j < al.size(); j++) 
		{
			Q16_Test t1 = al.get(j);
			int h=t1.sid;
			total=0;
				for (int i = 0; i < t1.marks.length; i++) 
				{
				   total=total+t1.marks[i];
				}
			stud.add(new Studenttest(h, total))	;
		}

		System.out.println(stud);
		
		TreeSet<Studenttest> ts = new TreeSet<>(new Comparator<Studenttest>(){
			@Override
			public int compare(Studenttest o1, Studenttest o2) {
				// TODO Auto-generated method stub
				return o2.totalmarks-o1.totalmarks;
			}
        });
 
        // add HashSet elements to TreeSet
        ts.addAll(stud);
        System.out.println("After Desending order = ");
        System.out.println(ts);
	}

}
