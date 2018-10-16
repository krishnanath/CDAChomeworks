import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class HashMapEX{
public static void main(String  args[])
{
    HashMap<String,Integer> hm = new HashMap<String,Integer>();
      
     hm.put("Krishna", 88888);
    hm.put("Anjitha", 100000);

     

    for(Map.Entry m:hm.entrySet()){
        System.out.println(m.getKey()+" "+m.getValue());
    }

}
}