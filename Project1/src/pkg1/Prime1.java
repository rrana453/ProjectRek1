package pkg1;

import java.util.Scanner;

public class Prime1 
{
  public static void main(String[] args) 
  {
	  System.out.println("Enter the number");
	  Scanner s=new Scanner(System.in);
	  int number=s.nextInt();
	  int half=number/2;
	  int rekha=0;
	  for(int i=2;i<=half;i++)
	  {
		  if(number%i==0)
		  {
			  System.out.println("Number is not Prime");
			  rekha=1;
			  break;
		  }
	  }
    if (rekha==0)
     {
	System.out.println("Number is Prime");
     }
  }
}
