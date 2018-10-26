import java.util.*;

public class StackDemo
{
	public static void main(String args[])
	{
		Stack<Integer> st=new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		Enumeration<Integer> venum=st.elements();
		while(venum.hasMoreElements())
		{
			System.out.println(venum.nextElement());
		}
		Integer a=st.pop();
		System.out.println("Poped Element is: "+a);
		System.out.println("The top most element in the stack is: "+st.peek());
		Enumeration<Integer> venum1=st.elements();
		while(venum1.hasMoreElements())
		{
			System.out.println(venum1.nextElement());
		}
	}
}