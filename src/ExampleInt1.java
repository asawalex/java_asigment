import java.util.function.BiFunction;

public interface ExampleInt1 {
    public static void main(String[] args) {
        BiFunction< String,Integer, Boolean> function = (a, b) -> a.length() == b;
        boolean result = function.apply("wale", 4);
        System.out.println(result);
    }

}
