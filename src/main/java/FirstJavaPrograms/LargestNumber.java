package FirstJavaPrograms;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        if(num1 > num2){
            System.out.println("num1 is the largest number "+ num1);
        }else {
            System.out.println("num2 is the largest number "+ num2);
        }

        input.close();
    }
}
