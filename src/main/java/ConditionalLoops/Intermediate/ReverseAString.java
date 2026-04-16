package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a String to reverse : ");
        String org = sc.next();
        String rev = "";
        for(int i =0; i<org.length(); i++){
            char c = org.charAt(i);
            rev = c + rev;
        }
        System.out.println("Reverse a String " + rev);

        sc.close();
    }
}
