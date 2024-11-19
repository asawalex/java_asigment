import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    }


    public static int numbersOfTheElement(Scanner input){
        System.out.println("Enter the number of elements: ");
        return input.nextInt();
    }


    public static int[] listOfNumbers(int num,Scanner input){

        int[] array = new int[num];
        for (int count = 0; count < array.length; count++) {
            System.out.println("Enter the number " + count + ": ");
            int numberInt = input.nextInt();

        }
        return array;

    }
    public static boolean evenAndOdd(int[] aray,int counter,Scanner input) {

            if (aray[counter] % 2 == 0) {
                return true;
            }
        return false;
    }
}
