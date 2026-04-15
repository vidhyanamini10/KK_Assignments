package ConditionalLoops.Basic;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Addition of two numbers : " + (a+b));
        sc.close();
    }
}
