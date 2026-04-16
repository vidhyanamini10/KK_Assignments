package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to check leap or not:  ");

        int year = sc.nextInt();

        if(year % 400 == 0 || (year % 4 ==0 && year % 100 !=0)){
            System.out.print(year + " is a leap year");
        }else {
            System.out.print(year + " is not a leap year");
        }
        sc.close();
    }
}
