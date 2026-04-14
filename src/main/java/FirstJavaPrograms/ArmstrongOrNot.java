package FirstJavaPrograms;

import java.util.Scanner;

public class ArmstrongOrNot {

    public static void main(String[] args) {
        // Armstrong btw 2 numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        int result1 = cubic(num1);
        int result2 = cubic(num2);
        if(result1 == num1){
            System.out.println(num1 + " Its a armstrong number");
        }
        if(result2 == num2){
            System.out.println (num2 + " Its a armstrong number");
        }

        if(result1 != num1 && result2 != num2){
            System.out.println("Numbers are not armstrong numbers");
        }
        sc.close();
    }

    // get the cube number for a given number

    private static int cubic (int num){
        int cubicNum =0;
        int count = countDigits(num);
        while (num >0){
            int temp = num % 10;

            cubicNum = cubicNum + (int) Math.pow(temp, count);
            num = num / 10;

        }
        return cubicNum;
    }

    private static int countDigits(int num){
        int count =0;
        while(num >0){
            int temp = num % 10;
            count++;
            num = num /10;
        }

        return count;

    }
}
