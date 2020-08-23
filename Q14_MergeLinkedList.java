package com.collectionmasterassignment;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

/*
 * Given two LinkedList, we need to combine two LinkedList  in such a way that 
 * the combined aList has alternate elements of both. If one list has extra element, 
 * then these elements are appended at the end of the combined list.

Input : list1 = {1, 2, 3, 4, 5, 6}
List2 = {11, 22, 33, 44}
List3: {1, 11, 2, 22, 3, 33, 4, 44, 5, 6}

 */
public class Q14_MergeLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);

		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(11);
		list2.add(22);
		list2.add(33);
		list2.add(44);

		LinkedList<Integer> list3 = new LinkedList<>();

		if (list1.size() > list2.size()) {
			int i = 0;

			while (i < list2.size()) {
				list3.add(list1.get(i));
				list3.add(list2.get(i));
				i++;
			}
			while (i < list1.size()) {
				list3.add(list1.get(i++));
			}
		}

		if (list2.size() > list1.size()) {
			int i = 0;

			while (i < list1.size()) {
				list3.add(list1.get(i));
				list3.add(list2.get(i));
				i++;
			}

			while (i < list2.size()) {
				list3.add(list2.get(i++));
			}
		}

		System.out.println(list3);

	}

}
