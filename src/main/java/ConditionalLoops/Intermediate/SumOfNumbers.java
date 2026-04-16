package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any numbers to get the sum perss 0 to exit: ");
        int num = sc.nextInt();
        int negSum = 0;
        int posEvenSum =0;
        int posOddSum =0;
        while (num !=0){
            if(num < 0){
                negSum += num;
            }else if(num % 2 == 0){
                posEvenSum += num;
            }else {
                posOddSum += num;
            }
            num = sc.nextInt();
        }

        System.out.println("sum of negative numbers: " + negSum + " sum of positive even numbers: " + posEvenSum + " sum of positive odd numbers " + posOddSum );

        sc.close();
    }
}
