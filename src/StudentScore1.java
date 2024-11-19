import java.util.Arrays;
import java.util.Scanner;

public class StudentScore1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] arrays = studentScore( console);
        System.out.println(Arrays.toString(arrays)) ;

}
    public static int[] studentScore( Scanner input) {
        int[] array = new int[10];

        for(int count = 0; count < array.length; count++) {
            System.out.println("Enter student score: ");
            int numbers =  input.nextInt();
            array[count] = numbers;
        }

        return array;
    }
}
