package FirstJavaPrograms;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome or not : ");
        String s = str.next();

        String reverse = ""; // created a new variable
        int n = s.length();
        for(int i =0; i< n; i++){
            char ch = s.charAt(n -1 - i);
            reverse += ch;
        }
        if(reverse.equals(s)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
