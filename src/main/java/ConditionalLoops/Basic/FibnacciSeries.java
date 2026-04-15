package ConditionalLoops.Basic;

import java.util.Scanner;

public class FibnacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        while (a <= num){
            System.out.print(a + " ");
            int c = a + b;
            a =b;
            b =c;
        }
    }
}
