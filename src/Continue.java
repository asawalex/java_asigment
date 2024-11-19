import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            if(i == 5)
                continue;
            System.out.println(i);
        }
    }
}
