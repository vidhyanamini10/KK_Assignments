package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of marks you want to sum and press X to exist: ");
        int sum =0;
        while(true){
            String s = sc.next();
            if(s.equalsIgnoreCase("X")) break;
            int num = Integer.parseInt(s);
            sum = sum + num;

        }
        System.out.println("The sum of N Numbers is : " + sum);

    }
}
