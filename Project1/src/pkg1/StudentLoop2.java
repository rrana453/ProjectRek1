package pkg1;

import java.util.Scanner;

public class StudentLoop2 //nested if else condition
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter the number");
		Scanner s=new Scanner(System.in) ;
		int no=s.nextInt();
		if(no>0)
			{
			  if(no%2==0)
			  {
				System.out.println("This is even number");
			  }
			  else
			  {
				System.out.println("This is odd number");
			  }
			} 
			else
			{
			System.out.println("please enter positive number");	  
			}
			
				
	}

}
