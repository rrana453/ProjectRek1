package pkg1;

public class Maruti 
{
  public int sum(int a,int b)
  {
	int c;
	c=a+b;
	System.out.println("Sum is " + c);
	return c;
  }
  public int sub(int a,int b)
  {
	int c;
	c=a-b;
	System.out.println("Sub is " + c);
	return c;
  }
  public int mul(int a,int b)
  {
	int c;
	c=a*b;
	System.out.println("mul is " + c);
	return c;
  }
  public static void main(String[] args) 
  {
	  Maruti rekha = new Maruti();
	  int sumResult=rekha.sum(2, 3);
	  int subResult=rekha.sub(7, 6);
	  rekha.mul(sumResult, subResult);
	  
	
  }
}
