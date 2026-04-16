package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to calcuate average and press X to exit ");

        int temp = 0;
        int count =0;
        while(true){
            String s = sc.next();
            if(s.equalsIgnoreCase("X")) break;

            count++;
            temp = temp + Integer.parseInt(s);


        }
        int  avg = temp /count;

        System.out.println("Avg of numbers: " + avg);
    }
}
