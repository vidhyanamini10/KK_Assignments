package FirstJavaPrograms;

import java.util.Scanner;

public class FibnocciSeries {
    public static void main(String[] args) {
        // fibnoci
        // 0 1 1 2 3 5 8 13 21 34 55 89 ....
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;


        while(a <= num){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;

            //System.out.print(a);
        }
    }

}
