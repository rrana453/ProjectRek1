package pkg1;

import org.omg.Messaging.SyncScopeHelper;

public class Day2_1 
{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(" Sum result is "+c);
		return c;
	}
	public int sub(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println(" Sub result is "+c);
		return c;
	}
	public int mul(int a,int b)
	{
		int c;
		c=a*b;
		System.out.println(" mul result is "+c);
		return c;
	}
	public void div(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println(" Div result is "+c);
	}
    public static void main(String[] args) 
    {
	Day2_1 rekha = new Day2_1();
	int sumResult= rekha.sum(10, 2);
	int sumResult2=rekha.sum(sumResult,2);
	int subResult=rekha.sub(sumResult2,2);
	int mulResult=rekha.mul(subResult,2);
	rekha.div(mulResult,2);	
    }	
}
