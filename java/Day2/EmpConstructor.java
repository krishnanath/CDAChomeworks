//Create the parameterized constructor for setting ename, eid, designation, salary, age using parameterized constructor?

import java.io.*;
import java.lang.*;
class Employee
{
	    String ename;
		int eid;
		String designation;
		int salary;
		int age;
	Employee(String name,int empid,String desig,int sal,int a)
	{
		ename=name;
		eid=empid;
		designation=desig;
		salary=sal;
		age=a;
		
	}
	public void display()
	{
		System.out.println("Name: "+ename+"\nEmloyee Id: "+eid+"\nDesignation: "+designation+"\nSalary: "+salary+"\nAge:"+age);
	}
	
}	
public class EmpConstructor
{
	public static void main(String args[])throws IOException
	{
		Employee e1=new Employee("Anila",111,"Manager",20000,24);
		e1.display();
	}
}