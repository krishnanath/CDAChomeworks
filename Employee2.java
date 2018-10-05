import java.util.*;
class employee
{
public static void main (String args[])
{
employeeinfo ob = new employeeinfo();
ob.get();
ob.totalsalary();
ob.display();

}
}

class employeeinfo
{
Scanner in = new Scanner (System.in);
Scanner ins = new Scanner (System.in);
String name,gender,position;
int id,salary,ma,hr,bn;

void get()
{
System.out.print ("\n\t Enter employee ID = ");
id = in.nextInt();
System.out.print ("\n\t Enter emplyee name = ");
name = ins.nextLine();
System.out.print ("\n\t Enter employee gender = ");
gender = ins.nextLine();
System.out.print ("\n\t Enter employee salary = ");
salary = in.nextInt();
System.out.print ("\n\t Enter employee position = ");
position = ins.nextLine();
}

void totalsalary()
{
System.out.print ("\n\t Enter expense allowance = ");
ma = in.nextInt();
System.out.print ("\n\t Enter house rent = ");
hr = in.nextInt();
System.out.print ("\n\t Enter bounus = ");
bn = in.nextInt();
}

void display()
{
System.out.println ("\n\t Employee ID = "+id);
System.out.println ("\n\t Employee name = "+name);
System.out.println ("\n\t Employee gender = "+gender);
System.out.println ("\n\t Employee basic salary = "+salary);
System.out.println ("\n\t Employee position/post = "+position);
System.out.println ("\n\t Total salary = "+(ma+hr+bn+salary));
 }

}