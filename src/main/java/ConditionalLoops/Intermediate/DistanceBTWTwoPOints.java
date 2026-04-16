package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class DistanceBTWTwoPOints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 value: ");
        int x1 = sc.nextInt();
        System.out.print("Enter x2 value: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y1 value: ");
        int y1 = sc.nextInt();
        System.out.print("Enter y2 value: ");
        int y2 = sc.nextInt();

        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.printf("The distance between two points is %.2f%n" , distance);
    }
}
