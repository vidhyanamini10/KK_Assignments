package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find sum of digits: ");

        int num = sc.nextInt();
        int sum =0;
        while(num >0){
            int temp = num % 10;
            sum = sum + temp;
            num = num /10;
        }
        System.out.println("Sum of digits of a given number: " + sum);
        sc.close();
    }
}
