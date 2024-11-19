import java.util.function.UnaryOperator;

public interface ExampleItt {
    public static void main(String[] args) {
        UnaryOperator<Integer> integerUnaryOperator = (x) -> x * 3;
        System.out.println(integerUnaryOperator.apply(1));
    }
}
