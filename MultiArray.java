import java.io.*;
public class evenOddSum
{
    public static void main(String args[]) throw IoException
    {
        int row_size, col_size;
        int a[] [] =new int[row_size] [col_size];
        int i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter row Size");
        row_size = Integer.parseInt(br.readLine());
        System.out.println("Enter coloumn Size");
        col_size = Integer.parseInt(br.readLine());
        int a[][] = new int[row_size] [col_size];
        for(i=0; i<row_size; i++){
            for (j=0; j<col_size; j++)
            {
                a[i][j] =Integer.parseInt(br.readLine());
            
            }
            System.out.println()

        }
    }
}