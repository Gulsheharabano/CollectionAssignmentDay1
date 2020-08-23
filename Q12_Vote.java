package com.collectionmasterassignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/*
 * Create a Map<String,String> where key is adharno  and value is voted casted to which party
 * (eg. BJP,ShivSena,NCP,Congress,Other) .From this create new map such that KEY is party name 
 * and value is count of votes casted 
 */
public class Q12_Vote {

	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<>();
		
		hm.put("123586538688", "BJP");
		hm.put("234567345567", "NCP");
		hm.put("234567345560", "BJP");
		hm.put("234567345568", "Congress");
		hm.put("234567345566", "NCP");
		hm.put("234567345563", "BJP");
		hm.put("234567345562", "BJP");
		hm.put("234567345561", "NCP");
		hm.put("234567345569", "Congress");
		
		HashMap<String, Integer> hm1=new HashMap<>();
		
		Collection<String> values = hm.values(); 
		ArrayList<String> al=new ArrayList<>(values);
		
		int cnt = 1;
		for (int i = 0; i < al.size(); i++) 
		{
			cnt = 1;
			boolean flag = false;
			for (int j = i - 1; j >= 0; j--) 
			{
				if (al.get(i) == al.get(j)) 
				{
					flag = true;
				}
			}
			if (flag==false) 
			{
				for (int k = i + 1; k < al.size(); k++) 
				{
					if (al.get(i) == al.get(k)) 
					{
						cnt++;
					}
				}
				//System.out.println(al.get(i) + "-" + cnt);
				String a=al.get(i);
				hm1.put(a, cnt);
			}

		}
		System.out.println(hm1);

	}

}
