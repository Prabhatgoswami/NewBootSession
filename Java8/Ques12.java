import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Ques12 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Optional<Integer> optionalDouble= list
                .stream()
                .filter(e->e>3)
                .findFirst()
                .filter(e->e%2==0);
        if(optionalDouble.isPresent())
        {
            System.out.println("First Even Number Greater than 3 -->  "+optionalDouble.get());
        }

    }
}
