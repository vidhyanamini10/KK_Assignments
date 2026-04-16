package ConditionalLoops.Intermediate;

import java.time.YearMonth;
import java.util.Scanner;

public class EvenDaysCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month number to get the count of even numbers : ");

        int month = sc.nextInt();

        YearMonth ym = YearMonth.of(2026,month);
        int days = ym.lengthOfMonth();
        int evenCount = days / 2;

        System.out.println("Even days count for month " +month + " is " + evenCount);

        sc.close();
    }
}
