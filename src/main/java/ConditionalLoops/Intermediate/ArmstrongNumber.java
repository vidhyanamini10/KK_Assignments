package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int result = powNumber(num);
        if(num == result) {
            System.out.println("Its a Armstrong number");
        }else {
            System.out.println("Its not a armstrong number");
        }
        sc.close();
    }

    private static int powNumber(int num){
        int powerNum =0;
        int count = countOfDigits(num);
        while(num > 0){
            int temp = num % 10;
            powerNum = powerNum + (int) Math.pow(temp, count);
            num = num/10;
        }
        return powerNum;
    }

    private static int countOfDigits(int num){
        int count =0;
        while(num > 0){
            count ++;
            num = num /10;
            //++count;
        }
        return count;
    }
}
