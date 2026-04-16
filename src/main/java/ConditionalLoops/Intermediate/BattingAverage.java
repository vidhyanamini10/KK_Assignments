package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total hits:  ");
        int hits = sc.nextInt();
        System.out.print("Enter the total at bats :  ");
        int atBats = sc.nextInt();


        double battingAvg = (double) hits / atBats;



        System.out.println("Batting Average is " + battingAvg );
    }
}
