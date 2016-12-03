package java5features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsInt
{
	public static void main(String[] args) 
	{
		//It stores only integer type of elements
		List<Integer> list=new ArrayList<>();
		list.add(26);
		list.add(31);
		list.add(25);
		list.add(27);
		//list.add("java"); //It gives compile time error
		Integer i=list.get(0);//No type casting required
		System.out.println("Element is "+ i);
		
		Iterator<Integer> itr= list.iterator();
		while(itr.hasNext())
		{			
			System.out.println(itr.next());			
			
		}	
		/*for(int a:list)
		{
			System.out.println(a);
		}*/
		
		
	}

}
