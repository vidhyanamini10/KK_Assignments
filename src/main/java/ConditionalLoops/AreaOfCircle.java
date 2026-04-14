package ConditionalLoops;

import java.util.Scanner;

public class AreaOfCircle {
    public static final double PI = 3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double rad = sc.nextDouble();

        double area = PI * Math.pow(rad,2);

        System.out.printf("Area of the circle : %.2f%n",  area);

        sc.close();

    }
}
