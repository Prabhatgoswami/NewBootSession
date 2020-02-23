import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurenceQues3 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new LinkedHashMap<String ,Integer>();

        System.out.println("Enter any String");
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        String [] NewString=string.split("");

        for(int i=0;i<NewString.length;i++)
        {
            if(!map.containsKey(NewString[i]))
            {
                map.put(NewString[i],1);
            }
            else
            {
                map.put(NewString[i],map.get((NewString[i]))+1);
            }
        }

        for(Map.Entry<String ,Integer> entry:map.entrySet())
        {
            String key=entry.getKey();
            int value=entry.getValue();
            System.out.println(key+":"+value);
        }
    }
}
