package pkg1;

public class ConstChild extends ConstParent
{
	 public ConstChild()
	  {
		 this(12,13,14);
	    System.out.println("Child default constructor");  
	  }
	  public ConstChild(int a)
	  {
		  this(12,13,14,12);
	    System.out.println("Child 1 parameter constructor");  
	  }
	  public ConstChild(int a,int b)
	  {
		  this(12);
	    System.out.println("Child 2 parameter constructor");  
	  }
	  public ConstChild(int a,int b,int c)
	  {
		super(12,13,14,12);
	    System.out.println("Child 3 parameter constructor");  
	  }
	  public ConstChild(int a,int b ,int c,int d)
	  {
		  this();
	    System.out.println("Child 4 parameter constructor");  
	  }
public static void main(String[] args) 
{
	ConstChild s=new ConstChild(12,12);	
}
}
