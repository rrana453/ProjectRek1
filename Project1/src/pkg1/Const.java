package pkg1;

public class Const 
{
	public Const() 
	{
		this(12,13,14,15);
		System.out.println("default constructor");
	}
	public Const(int a)
	{
		this(12,13);
		System.out.println("one parameter constructor");
	}
	public Const(int a,int b)
	{
		this();
		System.out.println("two parameter constructor");
	}
	public Const(int a,int b,int c) 
	{
		this(3);
		System.out.println("three parameter constructor");
	}
	public Const(int a,int b,int c, int d) 
	{
		System.out.println("four parameter constructor");
	}
public static void main(String[] args) 
{
	Const rekha = new Const(12,23,45);
	
}
}
