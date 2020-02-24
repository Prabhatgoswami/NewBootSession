import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ques11 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        System.out.println("Average of the Given Integer List by Doubling it ");

                OptionalDouble optional=list
                        .stream()
                       .mapToDouble(e->e*2)
                        .average();
//
        if(optional.isPresent())
        {
            System.out.println(optional.getAsDouble());
        }

    }
}
