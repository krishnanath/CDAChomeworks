//Write a program called CheckPassFail which prints &quot;PASS&quot; if the int variable
//&quot;mark&quot; is more than or equal to 50; or prints &quot;FAIL&quot; otherwise?

public class CheckPassFail{
    public static void main(String[] args){
        int mark= 40; 
        boolean  CheckPassFail =(mark >= 50);
        System.out.println(CheckPassFail);
 
        if(CheckPassFail){
            System.out.println("Passed");
        }else
        {
            System.out.println("Failed");
        }
    }
}