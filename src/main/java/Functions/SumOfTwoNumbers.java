package Functions;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 to check sum ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 to check sum ");
        int num2 = sc.nextInt();
        System.out.println("sum of 2 numbers is : " + sum(num1, num2));
        sc.close();
    }
    private static int sum(int num1, int num2){
        return num1 + num2;
    }
}
