package Functions;

import java.util.Scanner;

public class SumOfNnaturalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number1 to get sum of n natural numbers :  ");
        int num1 = sc.nextInt();
        System.out.println("Sum of N natural numbers are : " +sum(num1));


        sc.close();
    }

    private static int sum(int num){
        return (num * (num +1))/2;
    }
}
