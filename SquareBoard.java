import java.util.*;
public class SquareBoard {
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int no=sc.nextInt();
        int count=1;
        for(int i=1; i<=2*no-1; i++)
        {
            for(int j=count; j<=no; j++)
            {
                System.out.print("  ");

            }
            for (int k=1; k<=count*2-1; k++){
                System.out.print("* ");

            }
            if(i<no)
            count++;
            else count--;
            System.out.println("");
        }
    }
}