package java5features;

public class EnumExample
{
	public enum Company
	{
		Google,Yahoo,Infosis,TCS		
	}
	 
	Company cName;
	
	public EnumExample(Company cName)
	{
		this.cName=cName;
	}
	
	public void companyDetails()
	{
		switch(cName){
		
		case Google:
			System.out.println("Biggest search engine");
			break;
		
		case Yahoo:
			System.out.println("Yahoo is a search engine");
			break;
			
		case TCS:
			
		case Infosis:
			System.out.println("One of the Top most comany");
		
		default:
			System.out.println("Top company");
			break;	
		
		}
	}
	public static void main(String[] args) 
	{
		
		EnumExample google=new EnumExample(Company.Google);
		google.companyDetails();
		
		EnumExample yahoo=new EnumExample(Company.Yahoo);
		yahoo.companyDetails();
		
		
		
	}

}
