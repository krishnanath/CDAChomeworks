import java.util.*;

public class  StackDemo
{
    public static void main(String args[])
    {
        Stack<Integer> st=new Stack<Integer>();
        st.push(3);
        st.push(1);
        st.push(1998);

Enumeration<Integer> venum=st.elements();
while(venum.hasMoreElements()){
    System.out.println(venum.nextElement());
}
    }
}