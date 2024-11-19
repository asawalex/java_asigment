import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Example3 {
    public static void main(String[] args) {
        Optional<Cat> value = get();
        System.out.println(value);

    }
    public static Optional<Cat> get(){
        List<Cat> cats = new ArrayList<Cat>();

        cats.add(new Cat("Tom",29));
        return cats.stream().findFirst();
    }
}
