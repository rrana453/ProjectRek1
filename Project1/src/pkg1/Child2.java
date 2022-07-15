package pkg1;

public class Child2 extends Child
{
   public void method3()
   {
	   System.out.println("This is the child  ");
   }
   public static void main(String[] args) 
   {
	Child2 d=new Child2();
	d.method1();
	d.method2();
	d.method3();
			
   }
   
}
