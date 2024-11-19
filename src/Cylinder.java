//public class Cylinder {
//    private int radius;
//    private double height;
//
//    public Cylinder(int radius, double height) {
//        this.radius = radius;
//        this.height = height;
//    }
//    public double radiusAndHightMethod(int radius, int height) {
//        double sum;
//        sum = Math.PI * radius * radius * height;
//        return sum/7;
//    }
//    public double formatTheResult(){
//     String.format("%.3f",radiusAndHightMethod(int radius,  height));
//     String ans = ()
//    }
//}
import java.util.Scanner;

public class Cylinder {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String okada = String.valueOf(output());

        System.out.println(okada);
    }


public static double output() {

    Double news = 25.9;

    return Double.parseDouble(String.format("%.2f", news));
    }

}