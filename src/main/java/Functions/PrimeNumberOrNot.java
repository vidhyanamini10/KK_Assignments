package Functions;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number1 for start range :  ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number2 for end range :  ");
        int num2 = sc.nextInt();
        for (int i = num1 +1 ; i< num2 ; i++){
            if(isPrime(i)){
                System.out.print( i + " ");
            }

        }

        sc.close();
    }

    private static boolean isPrime(int num){
        if(num < 2) return false;

        for(int i =2; i<num; i++){
            if(num %i ==0){
                return false;
            }
        }
        return true;
    }

}
