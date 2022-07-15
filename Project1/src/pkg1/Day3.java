package pkg1;

public class Day3 
{
   public void M()
    {
	System.out.println("default method");
    }
   public void M1(int a)
   {
	System.out.println("one para method");
   }
   public void M2(int a,int b)
   {
	   this.M3(1, 2, 3);
	   this.M();
	   this.M1(2);
	   this.M4(1, 2, 3, 4);
	System.out.println("two para method");
   }
   public void M3(int a,int b, int c)
   {
	System.out.println("three para method");
   }
   public void M4(int a,int b, int c,int d)
   {
	System.out.println("three para method");
   }
public static void main(String[] args) 
  {
	Day3 rekha = new Day3();
	rekha.M2(12,13);
  }

}
