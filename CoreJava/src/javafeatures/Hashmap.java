package javafeatures;

import java.util.HashMap;
import java.util.Map;

public class Hashmap
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(10,"manu");
		hm.put(20,"sudheer");
		hm.put(30,"manaswi");
		
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey() +" "+ m.getValue());
		}
		
		HashMap<String,Integer> hm1=new HashMap<String,Integer>();
		
		hm1.put("manu",10);
		hm1.put("sudheer",20);
		hm1.put("manaswi",30);
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getValue()+" "+ m.getKey() );
		}
	}

}
