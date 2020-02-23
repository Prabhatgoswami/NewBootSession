import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.w3c.dom.ls.LSOutput;

import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.*;

public class SorthashmapQues4 {
    public static void main(String[] args) {
        Map<Integer,String> hashmap=new HashMap<Integer, String>();

        hashmap.put(1,"Prabhat");
        hashmap.put(2,"Drishti");
        hashmap.put(3,"Udit");
        hashmap.put(4,"Akshita");
        hashmap.put(5,"Mohit");

        for(Map.Entry<Integer,String> entry:hashmap.entrySet())
        {
            int key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+" : "+value);
        }

        List<Map.Entry<Integer,String>> sortByValue = new ArrayList<Map.Entry<Integer,String>>(hashmap.entrySet());
        Collections.sort(sortByValue, new Comparator<Map.Entry<Integer, String>>()
        {

            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println();
        System.out.println("Sorted BY values");
        for(Map.Entry<Integer,String > sort :sortByValue)
        {
            System.out.print(sort.getValue()+" , ");
        }

    }



}
