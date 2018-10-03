import java.io.*;
public class arrayDemo
{
    public static void main(String args[]) throws IOException
    {
        int a[] = new int[10];
        BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter Numbers");
        for(int i=0; i<10; i++)
        {
            int n= Integer.parseInt(br.readLine());
            a[i]=n;
        }
    }
}