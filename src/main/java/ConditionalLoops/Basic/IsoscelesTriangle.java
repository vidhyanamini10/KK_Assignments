package ConditionalLoops.Basic;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the breadth od the Isosceles Triangle: ");
        double breath = input.nextDouble();
        System.out.print("Enter the height of the Isosceles Triangle: ");
        double height = input.nextDouble();
        double area = (breath * height) / 2;
        System.out.printf("Area of an Isosceles Triangle is : %.2f%n" , area);
        input.close();
    }
}
