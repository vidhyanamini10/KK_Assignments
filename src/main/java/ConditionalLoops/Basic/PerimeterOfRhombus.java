package ConditionalLoops.Basic;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the Rhombus: ");
        double radius = input.nextDouble();
        double perimeter = 4 * radius;
        System.out.println("Perimeter Of Rhombus: " + perimeter);
        input.close();
    }
}
