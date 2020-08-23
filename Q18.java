package com.collectionmasterassignment;

import java.util.ArrayList;

/*
 * An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on. Create a
method which accepts a String eg D in input and will return
associated number value eg in this case 4 by looping the arraylist and
finding matching pattern
 */
public class Q18 {
	static void get(ArrayList<String> al,String c)
	{
		//int temp=0;
		for(int i=0;i<al.size();i++)
		{
			String s=al.get(i);
			String s1[]=s.split("\\+");
			if(s1[0].equals(c))
			{
				//temp=Integer.parseInt(s1[1]);
				System.out.println(s1[1]);
			}
		}
		
	}
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("A+4");
		al.add("B+6");
		al.add("D+8");
		al.add("DD+9");
		al.add("D+13");
		al.add("D+89");
		get(al,"D");

	}

}
