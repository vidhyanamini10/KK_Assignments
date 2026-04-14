package ConditionalLoops;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the breadth of an Parallelogram: " );
        double breadth = sc.nextDouble();
        System.out.print("Enter the height of an Parallelogram: " );
        double height = sc.nextDouble();
        double area = breadth * height;
        System.out.printf("Area Of Parallelogram %.2f%n" , area);


        sc.close();
    }
}
