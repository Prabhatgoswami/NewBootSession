import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AddQues1 {

    public static void main(String[] args) {
        ArrayList<Float> list=new ArrayList<Float>();
        list.add(120.5f);
        list.add(140.5f);
        list.add(400.35f);
        list.add(170.95f);
        list.add(123.52f);
        ListIterator listIterator= list.listIterator();

        System.out.println("Float Array List : ");
        Iterator iterator=list.iterator();
        while (listIterator.hasNext())
        System.out.print(listIterator.next()+" , ");
        float sum=0;
        for(float value : list)
        {
            sum=sum+value;
        }
        System.out.println("\n Sum of float elements : "+sum);
    }
}
