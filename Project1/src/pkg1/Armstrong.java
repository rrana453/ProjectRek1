package pkg1;

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int orignialNo=number;
		int sum=0;
		if(number<999)
		{
		while(number>0)	
		{
			int r=number%10; // 153%10=3       15%10=5    1%10=1
			sum=sum+r*r*r;  //0*27=27          27+125=152  152*1=153
			number=number/10;	//153/10=15		15/10=1	  1/10=0
		}
		if(orignialNo==sum)
		{
			System.out.println("it is a Armstong number " +orignialNo);
		}
		else
		{
			System.out.println("it is not a Armstong number " +orignialNo);
		}
		}
	}
}
