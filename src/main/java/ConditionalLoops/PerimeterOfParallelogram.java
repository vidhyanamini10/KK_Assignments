package ConditionalLoops;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1 of the PerimeterOfParallelogram: ");
        double side1 = sc.nextDouble();
        System.out.println("Enter the side2 of the PerimeterOfParallelogram: ");
        double side2 = sc.nextDouble();
        double perimeter = 2 * (side1 + side2);
        System.out.println("Perimeter Of PerimeterOfParallelogram: " + perimeter);
        sc.close();
    }
}
