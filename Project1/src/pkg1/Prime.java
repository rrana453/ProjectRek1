package pkg1;

import java.util.Scanner;

public class Prime //Prime number
{
	public static void main(String[] args)
	{
		int num,i,count=0;
		System.out.println("Enter the value of a");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		for(i=2;i<num;i++)
		{
		if(num%i==0)
		   {
			count++;
		    break;
		   }    
		}
		if(count==0)
		{
			System.out.println("number is a Prime");
		}
		else 
			System.out.println("Number is not Prime");
	}
}
		
	
