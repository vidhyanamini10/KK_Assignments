package ConditionalLoops.Basic;

import java.util.Scanner;

public class ProdAndSumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int pro =1 ;
        int sum = 0;

        while (n >0){
            int temp = n % 10;
            pro = pro * temp;
            sum = sum + temp;
            n = n / 10;
        }
        System.out.println(pro - sum);
    }
}
