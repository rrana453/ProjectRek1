package pkg1;

public class ConstParent 
{
  public ConstParent()
  {
	this(12,23,34);
    System.out.println("Parent default constructor");  
  }
  public ConstParent(int a)
  {
	  this();
    System.out.println("Parent 1 parameter constructor");  
  }
  public ConstParent(int a,int b)
  {
	  this(12);
    System.out.println("Parent 2 parameter constructor");  
  }
  public ConstParent(int a,int b,int c)
  {
    System.out.println("Parent 3 parameter constructor");  
  }
  public ConstParent(int a,int b ,int c,int d)
  {
	  this(12,13);
    System.out.println("Parent 4 parameter constructor");  
  }
  
}
