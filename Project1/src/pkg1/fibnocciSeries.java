package pkg1;

public class fibnocciSeries
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<=10;i++)
		{
			int sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;	
		}
	}


}
