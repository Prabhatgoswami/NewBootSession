import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ques5 {
    public static void main(String[] args) {
        Consumer consumer=(a)-> System.out.println(a);
        System.out.println("Consumer Functional Interface : ");
        consumer.accept(10);


        System.out.println("<<--SUPPPLIER FUNCTIONAL INTERFACE -->>");
        Supplier supplier=()->{
          return 110;
        };

        System.out.println("Supplier Function returns an integer value : "+supplier.get());

        System.out.println("\n \n ");
        System.out.println("<<-- FUNCTION FUNCTIONAL INTERFACE -->>");
        Function<Integer,Integer> function=(a)->{
            return a*a;
        };
        System.out.println("Function will Square the number which we give  :"+ function.apply(9));

        System.out.println("\n \n ");
        System.out.println("<<-- PREDICATE FUNCTIONAL INTERFACE -->>");
        Predicate<Integer> predicate=(e)->{
            return e>5;
        };
        System.out.println("Predicate function it will check whether number is greater than 5 or not : "+predicate.test(2));

    }
}
