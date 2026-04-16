package Functions;

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 to check product ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 to check product ");
        int num2 = sc.nextInt();
        System.out.println("sum of 2 numbers is : " + product(num1, num2));
        sc.close();
    }
    private static int product (int num1, int num2){
        return num1 * num2;
    }
}
