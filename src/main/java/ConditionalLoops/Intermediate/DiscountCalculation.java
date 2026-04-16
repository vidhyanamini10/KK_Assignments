package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class DiscountCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total amount:  ");
        int amount = sc.nextInt();
        System.out.print("Enter the discount percentage :  ");
        double discount = sc.nextDouble();

        double discountedPrice = amount - (amount * (discount /100));

        System.out.println("Your amount is " + amount + " discount is " + discount + " Final price is : " + discountedPrice);





        sc.close();
    }
}
