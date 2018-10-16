import java.io.*;
class demo
{
	int var1,var2;
	int sum=0;
	public void add(int var1,int var2)
	{
		this.var1=var1;
		this.var2=var2;
		sum=var1+var2;
		System.out.println("The sum is: "+sum);
	}
}
public class mainDemo
{
	public static void main(String args[])
	{
		demo d=new demo();
		d.add(12,10);
	}

}