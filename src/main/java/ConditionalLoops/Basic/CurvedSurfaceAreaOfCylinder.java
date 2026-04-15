package ConditionalLoops.Basic;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        double rad = sc.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        double height = sc.nextDouble();
        double area = 2 * Math.PI * rad * height;
        System.out.printf(" CSA is  %.2f%n ", area);
        sc.close();
    }
}
