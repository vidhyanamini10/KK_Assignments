package Functions;

import java.util.Scanner;

public class EligibleForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a age to check eligible for vote or not  ");
        int age = sc.nextInt();
        eligibleOrNot(age);
        sc.close();
    }
    private static void eligibleOrNot(int age){
        if(age >=18){
            System.out.println("He is eligible for vote");
        }else {
            System.out.println("He is not eligible for vote");
        }
    }
}
