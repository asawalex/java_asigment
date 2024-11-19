
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class ExampleLambda {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    Arrays.stream(numbers)
            .filter((x) -> x %2 == 0)
            .mapToObj((x) -> new Transaction(x, BigDecimal.valueOf(500), LocalDateTime.now()))
            .forEach(System.out::println);

    }
}
