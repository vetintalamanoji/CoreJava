package javafeatures;

public class Exceptionhandling 
{
	public static void main(String[] args) 
	{
		String languages[]={"C","C++","Java","C#.Net","Perl"};
		try
		{
			for(int l=0;l<=5;l++)
			{
				System.out.println(languages[l]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
