package pkg1;

import java.util.Scanner;

public class SwappingOutThird //Swapping without using third variable
{
 public static void main(String[] args) 
 {
	 int a,b;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the value of a");
	 a=s.nextInt();
	 System.out.println("Enter the value of b");
	 b=s.nextInt();
	 System.out.println("Value of a and b before swapping " +a + "," +b);
		a=a+b;
		b=a-b;
		a=a-b;
	System.out.println("Value of a and b after swapping " +a + "," +b);
	
 }
}
