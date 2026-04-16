package Functions;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Palindrome or not :  ");
        int num = sc.nextInt();

        System.out.println("Is Palindrome " + isPalindrome(num));

        sc.close();
    }

    private static boolean isPalindrome(int num){
        int rev = 0;
        int org = num;
        while(num >0){
            int temp = num % 10;
            rev = (rev * 10) + temp;
            num = num /10;

        }
        if (rev == org){
            return true;
        }
        else {
            return false;
        }
    }

}
