package Functions;

import java.util.Scanner;

public class CircumAndAreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius to get circumference and area of a circle  ");
        double rad = sc.nextDouble();

        System.out.printf("Cicumference of circle : %.2f%n" , circum(rad));
        System.out.printf("Area of circle : %.2f " , area(rad));

        sc.close();
    }
    private static double circum (double rad){
        return 2 * Math.PI* rad;
    }

    private static double area (double rad){
        return Math.PI * Math.pow(rad,2);
    }
}
