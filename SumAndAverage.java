// Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to an
// upperbound (e.g., 100). Also compute and display the average. The output shall look
// like:
// The Sum is 5050
// the average is 50.5
// a. Modify the program to use a &quot;while &quot; loop instead of &quot;for&quot; loop.
// b. Modify the program to use a &quot;do-while&quot; loop.


public class SumAndAverage {
    public static void main(String[]arg){
  int sum = 0;
  double average=0 ;
  int loverbound = 1;
  int upperbound =100;
  for( int number = loverbound; number <= upperbound; ++number){
      sum += number;
      average = sum/100;
  }
  
     
  System.out.println("Sum = " + sum );
  System.out.println("Average = "+ average);

    }
}

// int number = lowerbound;
// int sum = 0;
// do {
//    sum += number;
//    ++number;
// } while (number <= upperbound);