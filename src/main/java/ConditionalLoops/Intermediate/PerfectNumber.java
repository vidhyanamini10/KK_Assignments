package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check perfect number or not : ");

        int num = sc.nextInt();
        int sum = 0;
        for(int i =1; i<=num/2; i++){
            if(num % i ==0){
                sum = sum + i;
            }
        }
        if(sum == num){
            System.out.print(num + " is a perfect number");
        }else {
            System.out.print(num + " is not a perfect number");
        }
        sc.close();
    }
}
