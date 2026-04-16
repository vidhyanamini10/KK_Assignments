package ConditionalLoops.Intermediate;

import java.util.Scanner;

/**
 *compound Interest
 * A: The final amount of money you will have after interest.
 P : The principal (initial deposit or loan amount).

 R: The annual interest rate expressed as a decimal .
 n : The number of times interest is compounded per year (monthly , quarterly).
 t: The number of years the money is invested or borrowed
 */

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount:  ");
        double principle = sc.nextDouble();
        System.out.print("Enter the interest rate :  ");
        double rate = sc.nextDouble();
        rate = rate / 100;
        System.out.print("Enter the number of times compounded per year:  ");
        double n = sc.nextDouble();

        System.out.print("Enter the number of yrs :  ");
        double time = sc.nextDouble();


        double a = principle * (Math.pow(1 +(rate/n),(n*time)));

        double total = a - principle;

        System.out.printf("compund interest is %.2f" , total );





        sc.close();
    }
}
