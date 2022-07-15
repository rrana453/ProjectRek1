package pkg1;

import java.util.Scanner;

public class StudentLoop1 //else if ladder
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner s= new Scanner(System.in);
		int marks=s.nextInt();
		if( (marks>0)&&(marks<35))
		{
			System.out.println("Failed");
		}
		else if( (marks>35)&&(marks<60))
		{
			System.out.println("Pass");
		}
		else if( (marks>60)&&(marks<80))
		{
			System.out.println("First division");
		}
		else if( (marks>80)&&(marks<100))
		{
			System.out.println("Merit");
		}
		else 
		{
			System.out.println("Please enter correct number");
		}
		
	}


}
