package pkg1;

import java.util.Scanner;

public class Table
{
	public static void main(String[] args) 
	{
		System.out.println("Table of ");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int b=1;
		for(int i=0;i<10;i++)
		{
			int mul=number*b; //2*1=2
			System.out.println(mul);
			b=b+1;// 1+1=2
		}
		
		
	}

}
