package com.collectionmasterassignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * Given a Linkedhashmap<string, integer> , find out if given list of keys (Strings )appear in
same order in hashmap. E.g. Linkedhashmap has { “pqr” , 12 } { “rst” , 43 } { “abc” , 4 } {“mno” ,2}
Given list is (“rst”) (“abc”) so it appears in same order. Output should be “true”
If given list is (“abc” ) (“pqr” ) then output should be “false”
 */
public class Q2_sameOrder {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		LinkedHashMap<String, Integer> lm= new LinkedHashMap<>();
		
		lm.put("pqr", 12);
		lm.put("rst", 43);
		lm.put("abc" , 4);
		lm.put("mno" ,2);
		/*
		for(int i=0;i<4;i++) {
			System.out.println("Enter String");
			String s=sc.next();
			System.out.println("Enter Number");
			int n=sc.nextInt();
			lm.put(s,n);
		}
		*/
		System.out.println(lm);
		ArrayList<String> al= new ArrayList<>();
		
		for(int i=0;i<2;i++) {
			System.out.println("Enter String");
			al.add(sc.next());
			
		}
		
		boolean flag=true;
		
		for(int i=0; i<al.size();i++) {
			if(flag==true) {
				Set s=lm.entrySet();
				Iterator itr= s.iterator();
				
				while(itr.hasNext()) {
					Map.Entry e=(Entry) itr.next();
					String str=(String) e.getKey();
					if(str.equals(al.get(i))) {
						flag=true;
						break;
					}
					
					else {
						flag=false;
						itr.remove();
					}
					
				}
			}
		}
		System.out.println(flag);
		
	}


}
