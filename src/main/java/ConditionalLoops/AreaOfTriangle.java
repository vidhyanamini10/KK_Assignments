package ConditionalLoops;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of the triangle : ");
        int height = sc.nextInt();
        System.out.print("Enter breadth of the triangle : ");
        int breadth = sc.nextInt();

        double area = (double) (height * breadth) / 2;

        System.out.printf("Area of the triangle is: %.2f%n" , area);
        sc.close();
    }
}
