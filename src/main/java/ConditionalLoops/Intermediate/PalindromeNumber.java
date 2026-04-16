package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number to check palindrome : ");
        int num = sc.nextInt();
        int num1 = num;
        int rev = 0;

        while(num >0){
            int temp = num % 10;
            rev = (rev * 10) + temp;
            num = num /10;
        }
        if(rev == num1){
            System.out.println(rev + " Its a palindrome number");
        }else {
            System.out.println(rev + " Its not a palindrome number");
        }



        sc.close();
    }
}
