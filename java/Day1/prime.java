public class prime{
public static void main(String args[])
{
int a;
a=Integer.parseInt(args[0]);
int n=a/2;
int count=0,i;
for(i=2;i<n;i++)
{
	if((a%i)==0)
	{
		count++;
	}
	
}
if(count==0)
{
	System.out.println("The number is prime");
}
else
{System.out.println("The number is not prime");}	
}
}