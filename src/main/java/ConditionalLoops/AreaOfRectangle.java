package ConditionalLoops;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the reactangle : ");
        double length = sc.nextDouble();

        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble();

        double area = length * width;
        System.out.printf("Area of the rectangle is : %.2f%n", area);
        sc.close();
    }
}
