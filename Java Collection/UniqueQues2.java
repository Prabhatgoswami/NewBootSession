import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueQues2 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<String ,Integer>();
        System.out.println("Enter the String to count the Distinct Character");
        Scanner scanner=new Scanner(System.in);
        String getstring=scanner.nextLine();
        String [] string=getstring.split("");
        int i=0;
        while(i<string.length)
        {
            if(!hashMap.containsKey(string[i]))
            {
                hashMap.put(string[i],1);
            }
            else
            {
                hashMap.put(string[i],hashMap.get(string[i])+1);
            }
            i++;
        }
        for(Map.Entry<String ,Integer> entry:hashMap.entrySet())
        {
            String key=entry.getKey();
            Integer value=entry.getValue();
            if(value==1)
            {
                System.out.println(key+":"+value);
            }
        }

    }
}
