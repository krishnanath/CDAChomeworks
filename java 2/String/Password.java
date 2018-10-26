// Write a program to generate password for the student where the password contains the 
// first and second letter of firstname  and third letter of lastname with his/her age?


import java.io.*;
public class Password
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first name: ");
		String fname=br.readLine();
		System.out.println("Enter last name: ");
		String lname=br.readLine();
		System.out.println("Enter age: ");
		String age=br.readLine();
		String p1=fname.substring(0,2);
		String pswd=p1+lname.charAt(2)+age;
		System.out.println("Your password is: "+pswd);
	}
}