package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sales amount:  ");
        double totalAmount = sc.nextDouble();
        System.out.print("Enter the commission Amount :  ");
        double commAmount = sc.nextDouble();

        double commRate = commAmount/totalAmount;

        commRate = commRate * 100;
        double profitAmount = totalAmount * (commRate/100);

        System.out.println("Your amount is " + totalAmount + " Commission Amount is " + commAmount + " profitAmount is : " + profitAmount);
        System.out.println("Commission Percentage is " + commRate );
    }
}
