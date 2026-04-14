package ConditionalLoops;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Area of a Prism : ");
        double baseArea = sc.nextDouble();

        System.out.println("Enter the height of the Prism : ");
        double height = sc.nextDouble();

        double volume = baseArea * height;
        System.out.printf("Volume of the prism is %.2f%n" , volume);
        sc.close();
    }
}
