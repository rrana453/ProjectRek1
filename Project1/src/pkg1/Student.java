package pkg1;

public class Student 
{
	int age;
	int roll_no;
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2()
	{
	System.out.println("Automation is easy");	
	}
	public static void main(String[] args) 
	{
	Student s=new Student();
	s.age=27;
	s.roll_no=383;
	s.display1();
	s.display2();
	System.out.println(s.age);
	System.out.println(s.roll_no);
    }
}
