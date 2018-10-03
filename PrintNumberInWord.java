import java.util.Scanner;

public class PrintNumberInWord {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        //int n = reader.nextInt();
        int number = reader.nextInt();
        String numberString="";
        switch(number){
            case 1: numberString ="1 - ONE";
            break;
            case 2: numberString ="2 - TWO";
            break;
            case 3: numberString ="3 - Threee";
            break;
            case 4: numberString="4 - FOUR";
            break;
            case 5: numberString="5 - FIVE";
            break;
            case 6: numberString="6 - SIX";
            break;
            case 7: numberString="7 - SEVEN";
            break;
            case 8: numberString="8 - EIGHT";
            break;
            case 9: numberString="9 - NINE";
            break;
            case 10: numberString="10 - TEN";
            default:System.out.println("ONLY ONE TO TEN NUMBERS");
        }
        System.out.println(numberString);
    }
}