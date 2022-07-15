package pkg1;

import java.util.Scanner;

public class Day4_1 
{
  public int sum(int x1, int x2)
  {
	  int x ;
	  x= x1+x2;
	  System.out.println("Sum of the number "+ x);
	  return x;
  }
  public int sub(int x1, int x2)
  {
	  int x ;
	  x= x1-x2;
	  System.out.println("Sub of the number "+ x);
	  return x;
  }
  public int mul(int x1, int x2)
  {
	  int x;
	  x=x1*x2;
	  System.out.println("Mul of the number "+ x);
	  return x;
  }
  public void div(int x1, int x2)
  {
	  int x;
	  x=x1/x2;
	  System.out.println("div of the number "+ x);
  }
  
	
public static void main(String[] args) 
{
	
	Scanner rekha= new Scanner(System.in);	
	Day4_1 rekha1 =new Day4_1();
	System.out.println("Please enter the value of x1 ");
	int x1=rekha.nextInt();
	System.out.println("Please enter the value of x2 ");
	int x2=rekha.nextInt();
	System.out.println("Please enter the value of x3 ");
	int x3=rekha.nextInt();
	System.out.println("Please enter the value of x4 ");
	int x4=rekha.nextInt();
	System.out.println("Please enter the value of x5 ");
	int x5=rekha.nextInt();
	System.out.println("Please enter the value of x6 ");
	int x6=rekha.nextInt();
	int sumResult=rekha1.sum(x1,x2);
	int subResult=rekha1.sub(sumResult,x3);
	int mulResult=rekha1.mul(subResult,x4);
	int sumResult2=rekha1.sum(mulResult,x5);
	rekha1.div(sumResult2, x6);	

}

}
