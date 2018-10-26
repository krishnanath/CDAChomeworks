import java.io.*;
import java.String.*;
public class empData
{
	    String name;
		int empid;
		int salary;
	public void addEmp(String ename,int eid,int sal)
	{
		name=ename;
		empid=eid;
		salary=sal;
		
	}
	public void display()
	{
		System.out.println("Name: "+name+"\nEmloyee Id: "+empid+"\nSalary: "+salary);
	}
	
}	
public class emp
{
	public static void main(String args[])throws IOException
	{
		System.out.println("Enter name,id,salary");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String n=Integer.parseInt(br.readLine());
		int id=Integer.parseInt(br.readLine());
		int s=Integer.parseInt(br.readLine());
		empData e1=new empData();
		e1.addEmp(n,id,s);
		e1.display();
	}
}