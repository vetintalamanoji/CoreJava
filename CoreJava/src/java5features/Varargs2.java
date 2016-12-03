package java5features;

public class Varargs2
{
	public static void show(int num,String...s)
	{
		System.out.println("Num is:"+num);
		for(String str:s)
		{
			System.out.println(str);
		}
		
	}
	
	public static void show(int...num)
	{
		for(int i:num)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) 
	{
		show(100,"java");
		//show(10);
		show(20,"java","j2ee");
		show(10,20,30,40,50,60);
		
	}

}
