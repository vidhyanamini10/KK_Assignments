package ConditionalLoops.Basic;

import java.util.Scanner;

public class LargestAmongAllinputNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers and enter 0 to exist");
        int num = sc.nextInt();

        int largest =0;
        if(num < 0) System.out.println("Invalid input");
        while(num !=0){
            // if(num > largest){
            //     largest = num;
            // }
            largest = Math.max(num,largest);
            num = sc.nextInt();
        }
        System.out.println("Sum of all numbers: " + largest);


        sc.close();
    }
}
