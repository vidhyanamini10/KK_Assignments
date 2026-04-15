package ConditionalLoops.Basic;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of a cube: ");
        double side = sc.nextDouble();
        double TSA = 6 * Math.pow(side,2);
        System.out.printf(" Total surface area of area of a Cube is %.2f%n" , TSA);
    }
}
