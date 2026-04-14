package ConditionalLoops;

import java.util.Scanner;

public class PerimeterOfCircle {
    private static final double PI = 3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: " );
        double rad = sc.nextDouble();
        double perimeter = 2 * Math.PI * rad;
        System.out.printf("Perimeter of Circle: %.2f%n", perimeter);
        sc.close();
    }
}
