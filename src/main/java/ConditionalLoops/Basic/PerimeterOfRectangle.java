package ConditionalLoops.Basic;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of the Rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter the width of an rectangle : ");
        double width = sc.nextDouble();

        double perimeter = 2 *(length + width);

        System.out.println("Perimeter Of Rectangle: " + perimeter);
        sc.close();
    }
}
