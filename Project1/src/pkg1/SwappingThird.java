package pkg1;

import java.util.Scanner;

public class SwappingThird  //Swapping using third variable
{
	public static void main(String[] args)
	{
		int a;
		int b;
		int c;
		System.out.println(" Enter the value of a and b");
		Scanner s=new Scanner(System.in);
		 a =s.nextInt();
		 b =s.nextInt();
		System.out.println("Value of a and b before swapping" +a +"," +b);
			c=a;
			a=b;
			b=c;
		System.out.println("Value of a and b after swapping"+a + "," +b);
		
	}
}
