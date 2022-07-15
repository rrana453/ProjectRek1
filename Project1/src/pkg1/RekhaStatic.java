package pkg1;

public class RekhaStatic 
{
   static int a=12;
	public void method1()
	{
		a=a+1;
	}
	public static void main(String[] args) 
	{
		RekhaStatic abc1 = new RekhaStatic();
		abc1.method1();
		System.out.println("value of method1 " +abc1.a);
		
		RekhaStatic abc2 = new RekhaStatic();
		abc2.method1();
		System.out.println("value of method1 " +abc2.a);
		
		RekhaStatic.a=15;
		System.out.println(" vale of the variable "+ RekhaStatic.a);
	}

}
