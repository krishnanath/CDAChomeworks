import java.util.*;
public class CalendarDemo1 {
   public static void main(String[] args) {
      
      // create a calendar
      Calendar cal = Calendar.getInstance();
      // get the value of all the calendar date fields.
      System.out.println("Calendar's Year: " + cal.get(Calendar.YEAR));
      System.out.println("Calendar's Month: " + cal.get(Calendar.MONTH));
      System.out.println("Calendar's Day: " + cal.get(Calendar.DATE));
   }
}
