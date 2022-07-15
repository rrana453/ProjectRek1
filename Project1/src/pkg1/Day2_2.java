package pkg1;

import org.omg.Messaging.SyncScopeHelper;

public class Day2_2 
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
	Day2_2 rekha = new Day2_2();
	int mulResult= rekha.mul(10, 2);
	int subResult=rekha.sub(mulResult,2);
	int sumResult=rekha.sum(subResult,2);
	int subResult2=rekha.sub(sumResult,2);
	rekha.div(subResult2,2);	
    }	
}
