package Functions;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check factorial:  ");
        int num = sc.nextInt();

        System.out.println("Your grade is : " + factorial(num));

        sc.close();
    }

    private static int factorial(int num){
        int fact =1;
        if(num ==0 || num ==1){
            return 1;
        }
        for (int i =1; i<=num; i++){
            fact = fact * i;
        }
        return fact;
    }


}
