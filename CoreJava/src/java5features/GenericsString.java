package java5features;

import java.util.ArrayList;

public class GenericsString 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add(2,"java");
		list.set(1,"core");
		//list.add(50.7);
		
		for(String str:list)
		{
			System.out.println(str);
		}
		
	}

}
