package com.collectionmasterassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 * An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on. Create a
map which has alphabets as keys and integers as values. If alphabet is
repeated add integer to old value
 */
public class Q17 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("A+4");
		al.add("B+6");
		al.add("D+8");
		al.add("DD+9");
		al.add("D+13");
		al.add("D+89");
		
		HashMap<String, Integer> hm=new HashMap<>();
		
		int temp=0;
		String temp1=null;
		for(int i=0;i<al.size();i++)
		{
			String s=al.get(i);
			String s1[]=s.split("\\+");
			//System.out.println(Arrays.toString(s1));
			if(s1[0].equals(s1[0]))
			{
				temp=Integer.parseInt(s1[1]);
				//System.out.println(s1[1]);
			}
			if(s1[1]==s1[1])
			{
				
				temp1=(s1[0]);
				//System.out.println(s1[1]);
			}
			hm.put(temp1, temp);
		}
		System.out.println(hm);

	}

}
