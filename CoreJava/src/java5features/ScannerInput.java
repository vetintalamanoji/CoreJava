package java5features;

import java.util.Scanner;

public class ScannerInput
{
	public static void main(String[] args)
	{
		int a,b,result;
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("Input two integers");
		a=input.nextInt();
		b=input.nextInt();
		try
		{
		result=a/b;
		System.out.println("Result: "+result);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception: Division by zero..");
		}
	}

}
