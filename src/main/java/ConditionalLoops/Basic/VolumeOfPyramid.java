package ConditionalLoops.Basic;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of a pyramid: ");
        double len = sc.nextDouble();
        System.out.println("Enter the height of a pyramid: ");
        double height = sc.nextDouble();
        System.out.println("Enter the width of a pyramid: ");
        double width = sc.nextDouble();

        double volume = (len * height * width)/3;
        System.out.printf("Volume of  Pyramid  is %.2f%n" , volume);
        sc.close();
    }
}
