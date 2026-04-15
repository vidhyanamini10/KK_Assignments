package ConditionalLoops.Basic;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: " );
        double rad = sc.nextDouble();

        double volume = 4.0/3.0 * (Math.PI * Math.pow(rad,3));

        System.out.printf("Volume of a sphere is %.2f%n" , volume);
        sc.close();
    }
}
