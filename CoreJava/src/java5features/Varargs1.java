package java5features;

public class Varargs1
{
	public static void display(String...values)
	{	
		for (String s:values)
		{
			System.out.println(s);
		}
		
	}
	
	public static void main(String[] args) 
	{
		display();
		display("manu");
		display("java","oracle");
		
		
	}
}
