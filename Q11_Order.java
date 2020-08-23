package com.collectionmasterassignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*
 * Hotel serves delicious Menus to its Customers. It maintains list of Orders given on daily basis. 
 * Order list is maintained as ArrayList<Order>. Each Order contains orderid, MenuName, price,  qtyOrdered.
 *  (Price of same Menu may vary according hours).
 *  From ArrayLsit of Orders create a map <String,Float> where Menu Name is key and 
 *  total sale in a day for theMenu as Value. (sale for the menu is Price*qty ordered).
 *  Eg. Order List for a day is :
[(80,”Pav Bhajee”,120.00,5),(90,”Grilled Sandwitch”,72.00,10),(92,”Hakka Noodles”,220.00,2),
(96,”Pav Bhajee”,125.00,8),(101,”Grilled Sandwitch”,70.00,2)]

Then Map would be like this :
{{“Pav Bhajee”,(120*5)+(125*8) ie.1600},   {“Hakka Noodles”, 440}, {“Grilled Sandwitch”,860}}
 */
public class Q11_Order {
	int orderid;
	String MenuName;
	float price;
	int qtyOrdered;
	
	public Q11_Order(int orderid, String menuName, float price, int qtyOrdered) {
		super();
		this.orderid = orderid;
		MenuName = menuName;
		this.price = price;
		this.qtyOrdered = qtyOrdered;
	}

	@Override
	public String toString() {
		return "Q11_Order [orderid=" + orderid + ", MenuName=" + MenuName + ", price=" + price + ", qtyOrdered="
				+ qtyOrdered + "]";
	}

	public static void main(String[] args) {
		ArrayList<Q11_Order> al=new ArrayList<>();
		
		al.add(new Q11_Order(80,"Pav Bhajee",120.00f,5));
		al.add(new Q11_Order(90,"Grilled Sandwitch",72.00f,10));
		al.add(new Q11_Order(92,"Hakka Noodles",220.00f,2));
		al.add(new Q11_Order(96,"Pav Bhajee",125.00f,8));
		al.add(new Q11_Order(101,"Grilled Sandwitch",70.00f,2));
		
		HashMap<String, Integer> hm=new HashMap<>();
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Q11_Order o1=(Q11_Order) itr.next();
			String mname=o1.MenuName;
			int amt=(int) (o1.price*o1.qtyOrdered);
			
			Set set=hm.entrySet();
			Iterator itr1=set.iterator();
			while(itr1.hasNext())
			{
				Map.Entry e=(Entry) itr1.next();
				String newbid=(String) e.getKey();
				if(mname==newbid)
				{
					int updateamt= (int) e.getValue();
					amt=(int) (amt + updateamt);
				}
			}
			hm.put(mname, amt);
		}
		System.out.println(hm);

	}

}
