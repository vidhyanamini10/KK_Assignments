package ConditionalLoops.Basic;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the equilateral triangle: ");
        double side = sc.nextDouble();
        double perimeter = 3 * side;
        System.out.printf("Perimeter Of Equilateral Triangle: %.2f%n" , perimeter);
        sc.close();
    }
}
