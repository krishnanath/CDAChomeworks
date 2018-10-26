// Create an Employee class having the fields Empname, EmpCode, EmpSalary and make a constructor to initialize 
//these values.Create main class called CollectionExample where create an arraylist to store the employee Objects. 
//In the same class ask the user to enter the employee code to search in the array and display the details of employee having the same code?

import java.util.*;
import java.io.*;
class Employee
{
	String empname;
	String empcode;
	String salary;
	Employee(String n,String c,String s)
	{
		empname=n;
		empcode=c;
		salary=s;
	}
	public String toString()
	{
		return "name: "+empname+" code: "+empcode+" salary: "+salary;
	}
}


public class CollectionExample
{
	public static void main(String args[])throws IOException
	{
		ArrayList<Employee> al=new ArrayList<Employee>();
		Employee e1=new Employee("anila","101","25000");
		al.add(e1);
		Employee e2=new Employee("revathy","102","20000");
		al.add(e2);
		Employee e3=new Employee("john","103","15000");
		al.add(e3);
		System.out.println("Enter code for searching employee: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String code=br.readLine();
		/*for(Employee a:al)
		{
			System.out.println(a);
		}*/
		Iterator<Employee> itr=al.iterator();
		while(itr.hasNext())
		{
			if(empcode=code)
			{
				String s1=itr.next();
				System.out.println(s1);
			}	
		}		
	}
}









