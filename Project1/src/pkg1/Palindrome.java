package pkg1;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int orignialNo=number;
		int sum=0;
		while(number>0)	
		{
			int r=number%10; // 151%10=1       15%10=5    1%10=1
			sum=sum*10+r;  //0*10+1=1          1*10+5=15  15*10+1=151
			number=number/10;	//151/10=15		15/10=1	  1/10=0
		}
		if(orignialNo==sum)
		{
			System.out.println("it is a Palindrome number " +orignialNo);
		}
		else
		{
			System.out.println("it is not a Palindrome number " +orignialNo);
		}
	}
}
