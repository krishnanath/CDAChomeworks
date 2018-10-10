import java.util.Scanner;

class DivideByZeroException {
    public static void main(String[] args) {
        int a, b, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");

        a = input.nextInt();
        b = input.nextInt() ;
        // result = a/b;
        // System.out.println("Result = " + result);

        //try block
        try {
            result = a/b;
            System.out.println("Result = " + result);
        }

        // Catch block 
        catch (ArithmeticException e){
            System.out.println("Exception caught: Division by Zero.");
        }
    }
}