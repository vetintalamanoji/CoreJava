package java5features;


@FunctionalInterface
interface Myinterface
{
	void add();
	//void sub();
}
class Test1
{
	public void showData()
	{
		System.out.println("class Test1 method");
	}
}

class Test2 extends Test1
{
	@Override
	public void showData()
	{
		System.out.println("class Test2 method");
	}
	@Deprecated
	public void display()
	{
		System.out.println("display");
	}
}

public class Annotations
{ 
	public static void main(String[] args) 
	{
		Test2 obj=new Test2();
		obj.showData();
		obj.display();
	}
}
