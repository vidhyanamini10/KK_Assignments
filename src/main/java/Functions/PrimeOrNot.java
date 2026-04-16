package Functions;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check prime or not  ");
        int num = sc.nextInt();

        System.out.println("Is prime number or not: " + isPrime(num));

        sc.close();
    }

    private static boolean isPrime(int num){
        if(num <= 2 && num >=1){
            return true;
        }else {
            for(int i =2 ; i< num; i++){
                if(num % i ==0) return false;
            }
            return true;
        }

    }
}
