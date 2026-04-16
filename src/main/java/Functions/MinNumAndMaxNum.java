package Functions;

import java.util.Scanner;

public class MinNumAndMaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num to get max and min numbers ");
        int num1 = sc.nextInt();
        System.out.print("Enter second num to get max and min numbers ");
        int num2 = sc.nextInt();
        System.out.print("Enter third num to get max and min numbers ");
        int num3 = sc.nextInt();

        maxNumber(num1, num2, num3);
        minNumber(num1, num2, num3);

        sc.close();
    }

    private static void maxNumber(int num1, int num2, int num3){
        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " max number");
        }else if(num2 >= num3){
            System.out.println(num2 + " max number");
        }else {
            System.out.println(num3 + " max number");
        }
    }

    private static void minNumber(int num1, int num2, int num3){
        if(num1 <= num2 && num1 <= num3){
            System.out.println(num1 + " min number");
        }else if(num2 <= num3){
            System.out.println(num2 + " min number");
        }else {
            System.out.println(num3 + " min number");
        }
    }
}
