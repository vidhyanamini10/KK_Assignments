package FirstJavaPrograms;

import java.math.BigDecimal;
import java.util.Scanner;

public class RupeeToUSDConversion {
    static double usdToInr= 0.011;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the rupee amount: ");
        int  rupee = input.nextInt();

        BigDecimal amount = BigDecimal.valueOf(rupee);
        BigDecimal rate = BigDecimal.valueOf(usdToInr);
        BigDecimal USDAmount = amount.multiply(rate);

        //BigDecimal bd = BigDecimal.valueOf(rupee * usdToInr);

        System.out.println("INR to USD conversion: $ " + USDAmount);
    }
}
