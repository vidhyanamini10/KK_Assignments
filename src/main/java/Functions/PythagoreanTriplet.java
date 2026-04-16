package Functions;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number1:  ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number2:  ");
        int num2 = sc.nextInt();
        System.out.print("Enter a number3:  ");
        int num3 = sc.nextInt();

        System.out.println("Is Palindrome " + isPythagorean(num1, num2, num3));

        sc.close();
    }

    private static boolean isPythagorean(int num1, int num2, int num3){
        return Math.pow((num1+num2),2) == Math.pow(num3,2);
    }

}
