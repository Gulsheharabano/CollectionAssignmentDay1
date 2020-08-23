package com.collectionmasterassignment;

import java.util.LinkedList;

/*
 * Given a linked list of integers , find out number of missing elements in linked list. E.g. list
contains { 2 , 3, 7} missing elements are 4, 5, 6. If list contains { 3 , 13 , 7 , 2 } . missing
elements are 4,5,6,8,9,10,11,12 and so on. Write a logic which will work for any list.
 */
public class Q3_MissingNumber {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(1);
		l1.add(3);
		l1.add(7);
		l1.add(9);
		
		System.out.println(l1);
		
		Integer max = Integer.MIN_VALUE; 
		Integer min = Integer.MAX_VALUE; 
        for (Integer i : l1) 
        { 
            if (min > i) { 
                min = i; 
            }
            
            if (max < i) { 
                max = i; 
            } 
        } 
        
        for (int i = min; i <= max; i++) { 
            if (!l1.contains(i)) { 
                System.out.print(i + " "); 
            } 
        } 

	}

}
