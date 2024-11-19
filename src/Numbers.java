import java.util.Arrays;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

//        int number = collectNumbers(console);
        int[] arrays = doubleArrayElements( console);
        System.out.println(Arrays.toString(arrays)) ;

    }
//    public static int collectNumbers(Scanner input) {
//        System.out.println("Enter the number of elements you want in the array: ");
//        return  input.nextInt();
//
//    }

    public static int[] doubleArrayElements( Scanner input) {
        int[] array = new int[10];

        System.out.println("Enter student score: ");

        for(int count = 0; count < array.length; count++) {
            int numbers =  input.nextInt();
            array[count] = numbers;

        }
        return array;
    }
}