import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques9 {
    public static void main(String[] args) {
        System.out.println("Printing the even Number from given Array List ");
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
            list
                    .stream()
                .filter(e->e%2==0) //filter the even number from the list
                .forEach(System.out::println);

    }
}
