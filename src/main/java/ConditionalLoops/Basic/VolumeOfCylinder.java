package ConditionalLoops.Basic;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        double rad = sc.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        double volume = Math.PI *(Math.pow(rad,2)) * height;
        System.out.printf("The volume of the cylinder is  %.2f%n" , volume);

    }
}
