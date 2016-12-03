package javafeatures;
import static java.lang.System.*;

public class stringExample
{
	public static void main(String[] args)
	{
		String str1="Hello";
		String str2=new String("Hello");
		String str=new String("Welcome");
		
		out.println("...toString() Method...");
		out.println(str1);
		out.println(str2);				
		out.println(str);
		out.println(str.substring(3, 7));
		out.println(str.toUpperCase());
		out.println(str.indexOf('l'));
		
		out.println("...equals() Method...");
		out.println(str1.equals(str2));
		
		System.out.println(str1==str2);
		
		System.out.println("...hashCode() Method...");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str.hashCode());	
		
		
	}

}
