package java5features;

public class Boxing
{
	public static void main(String[] args) 	
	{
		
		Integer iobj=new Integer(20);//Boxing
		//it gives 10 as in string format
		System.out.println(iobj);
		
		int a=iobj.intValue();//UnBoxing
		//it gives real integer value
		System.out.println("Real integer value is "+a);
		
		Integer ioj=10;//AutoBoxing
		Double dobj=30.5;
		Boolean bobj=true;
		System.out.println(ioj);
		System.out.println(dobj);
		System.out.println(bobj);
		
		int i=ioj;	//Auto UnBoxing
		double d=dobj;
		System.out.println("....Real integer values are....");
		System.out.println(i);
		System.out.println(d);
		
		String s1="90";
		String s2="10";
		System.out.println("................");
		System.out.println(s1+s2);
		
		//converting string format into integer using parseInt
		int a1=Integer.parseInt(s1);
		int b1=Integer.parseInt(s2);
		System.out.println(a1+b1);
		
		
	}

}
