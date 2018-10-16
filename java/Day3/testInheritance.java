// Declare one same variable in both parent and child class and try to access the variable of parent class in child class

class A
{
	int a=10;
	
}
class B extends A
{
	int a=15;
	
}
public class testInheritance
{
	public static void main(String args[])
	{
		B obj=new B();
		System.out.println("Child class variable a: "+obj.a);
		A obj1=new A();
		System.out.println("Parent class variable a: "+obj1.a);
	}
}