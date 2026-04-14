package ConditionalLoops;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a cone: ");
        double rad = sc.nextDouble();
        System.out.println("Enter the height of the cone: ");
        double height = sc.nextDouble();

        double volume = 1.0/3.0 * (Math.PI * (Math.pow(rad,2)) * height);
        System.out.printf("Volume of the cone: %.2f%n " , volume);
        sc.close();
    }
}
