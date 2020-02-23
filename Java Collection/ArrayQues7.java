import java.util.*;
import java.util.stream.Collector;

public class ArrayQues7 {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new LinkedHashMap<Integer, Integer>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = scanner.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            if(!map.containsKey(array[i]))
            {
                map.put(array[i],1);
            }
            else
            {
                map.put(array[i],map.get(array[i])+1);
            }
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            int key=entry.getKey();
            int value=entry.getValue();
            System.out.println(key+":"+value);
        }
        List<Map.Entry<Integer,Integer>> decreaseFrequency=new ArrayList<>(map.entrySet());
        Collections.sort(decreaseFrequency, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        });
        for(Map.Entry<Integer,Integer> entry:decreaseFrequency)
        {
            int frequency=entry.getValue();
            while (frequency>=1)
            {
                System.out.print(entry.getKey()+" ");
                frequency--;
            }
        }
    }
}

