package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a char to get vowel or Consonant: ");

        String s = sc.next();



        if("aeiou".contains(s.toLowerCase())){
            System.out.println( s + " is a Vowel");
        }else {
            System.out.println( s + " is a Consonant");
        }
        sc.close();
    }
}
