package com.collectionmasterassignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/*
 * 13. Consider List of T20 Players.
Player (playerid,Name,Country,team)
e.g. (1,”MSDhoni”,”India”,”Chennai Super Kings”)
Then find out which team has maximum Australian players.
 */
public class Q20_Player {
	int playerid;
	String Name;
	String Country;
	String team;

	public Q20_Player(int playerid, String name, String country, String team) {
		super();
		this.playerid = playerid;
		Name = name;
		Country = country;
		this.team = team;
	}

	@Override
	public String toString() {
		return "Q20_Player [playerid=" + playerid + ", Name=" + Name + ", Country=" + Country + ", team=" + team + "]";
	}

	public static void main(String[] args) {
		ArrayList<Q20_Player> al=new ArrayList<>();
		
		al.add(new Q20_Player(1,"MSDhoni","India","Chennai Super Kings"));
		al.add(new Q20_Player(1,"Virat kohli","India","mumbai Super Kings"));
		al.add(new Q20_Player(1,"Mohmmand","Australia","Chennai Super Kings"));
		al.add(new Q20_Player(1,"Raja","Australia ","kolkata Super Kings"));
		al.add(new Q20_Player(1,"Omkar","Australia","Chennai Super Kings"));
		al.add(new Q20_Player(1,"Ranjeet","Australia","mumbai Super Kings"));
		al.add(new Q20_Player(1,"Rohan","India","Chennai Super Kings"));

		ArrayList<Q20_Player> al1=new ArrayList<>();

		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Q20_Player p1=(Q20_Player) itr.next();
			String c=p1.Country;
			if (p1.Country.equals("Australia")) 
			{
				al1.add(p1);
			
			}
		}

		//System.out.println(al1);
		
		int max = 0;
		String maxteam = "";
		int cnt = 1;
		for (int i = 0; i < al1.size(); i++) 
		{
			cnt = 1;
			boolean flag = false;
			for (int j = i - 1; j >= 0; j--) 
			{
				if (al1.get(i).team.equals(al1.get(j).team)) 
				{
					flag = true;
				}
			}
			if (flag==false) 
			{
				for (int k = i + 1; k < al1.size(); k++) 
				{
					if (al1.get(i).team.equals(al1.get(k).team)) 
					{
						cnt++;
					}
				}				
			}
			
			if (cnt > max) 
			{
				max = cnt;
				maxteam = al1.get(i).team;
			}
		}

		System.out.println(maxteam);
		
	}

}

