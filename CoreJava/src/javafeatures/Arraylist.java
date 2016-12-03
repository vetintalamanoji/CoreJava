package javafeatures;



import java.util.ArrayList;


public class Arraylist 
{
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		ArrayList list=new ArrayList();
		list.add(10);
		list.add("java");
		list.add(9.5);
		System.out.println(list);
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
		
	}

}
