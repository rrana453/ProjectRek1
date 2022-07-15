package pkg1;

public class Child extends Parent
{
  public void method2()
  {
	  System.out.println("This is parent class method");
  }
  public static void main(String[] args) 
  {
	Child s=new Child();		
	s.method2();
	s.method1();
	s.price=122;
	System.out.println("This is the parent variable   "  +s.price);
	
  }
}
