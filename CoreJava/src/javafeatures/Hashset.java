package javafeatures;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		HashSet set=new HashSet();
		set.add(10);
		set.add("java");
		set.add(10);
		System.out.println(set);
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
