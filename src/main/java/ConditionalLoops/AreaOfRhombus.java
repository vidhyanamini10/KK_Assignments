package ConditionalLoops;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diag1 for Area Of Rhombus: ");
        double diag1 = sc.nextDouble();
        System.out.print("Enter diag2 for Area Of Rhombus: ");
        double diag2 = sc.nextDouble();

        double area = (diag1 * diag2) /2;
        System.out.printf("Area Of Rhombus %.2f%n", area);
        sc.close();
    }
}
