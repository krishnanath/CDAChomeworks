import java.io.*;

public class calc
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1 :addition \t 2 :subtraction \t 3: multiplication\t4: division");
		System.out.println("Enter the option which u want: ");
		int op=Integer.parseInt(br.readLine());
		System.out.println("Enter 2 numbers");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		
		switch(op)
		{
			case 1:System.out.println("Result is :"+(a+b));
					break;
			case 2:System.out.println("Result is :"+(a-b));
					break;
			case 3:System.out.println("Result is :"+(a*b));
					break;
			case 4:System.out.println("Result is :"+(a/b));
					break;
			default :System.out.println("Enter a valid option");
		}

	}
}