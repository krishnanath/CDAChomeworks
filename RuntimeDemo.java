import java.util.*;
import java.lang.*;
public class RuntimeDemo{
    public static void main(String[] args)
    {
        Process p= null;
        try{
            Runtime r=Runtime.getRuntime();
            p= r.exec("Keynote");
            p.waitFor();
        
        }
        catch(Throwable e){
            System.out.println("Exception"+ e);
        }
        System.out.println("notepad returned" + p.exitValue());
    }
}