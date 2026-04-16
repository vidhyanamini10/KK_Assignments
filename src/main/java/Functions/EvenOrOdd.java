package Functions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num to find even or odd ");
        int num1 = sc.nextInt();
        evenOrOdd(num1);
        sc.close();
    }
    private static void evenOrOdd(int num1){
        if(num1 %2 ==0){
            System.out.println("Its a even number");
        }else {
            System.out.println("Its a odd number");
        }
    }
}
