package ConditionalLoops.Basic;

import java.util.Scanner;

public class SumOfAllinputNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers and enter 0 to exist");
        int num = sc.nextInt(); // read first number before loop
        int temp =0;
        while(num !=0){
            temp = temp + num;
            num = sc.nextInt(); // to read next number
        }
        System.out.println("Sum of all numbers: " + temp);


        sc.close();
    }
}
