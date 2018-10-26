//Create a class Employee with the field’s ename, eid, designation, salary, age. Create get and set methods for fields to 
//set and return values. Also write a method for calculating the salary. Display the values of all the fields and salary?

import java.io.*;
import java.lang.*;
class Employee
{
	    String ename;
		int eid;
		String designation;
		int salary;
		int age;
	public void setEmp(String name,int empid,String desig,int sal,int a)
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
public class EmployeeMain
{
	public static void main(String args[])throws IOException
	{
		Employee e1=new Employee();
		e1.setEmp("Anila",111,"Manager",20000,24);
		e1.display();
	}
}