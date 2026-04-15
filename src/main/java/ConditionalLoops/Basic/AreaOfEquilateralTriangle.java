package ConditionalLoops.Basic;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static final double rootValue = 0.43301;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side value of an Equilateral Triangle : ");
        double side = sc.nextDouble();

        double area = rootValue * Math.pow(side, 2);
        System.out.printf("Area Of Equilateral Triangle: %.2f%n", area);
        sc.close();
    }
}
