package FirstJavaPrograms;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int input = sc.nextInt();
        if(input % 2 ==0){
            System.out.println("Its a even number");
        }else {
            System.out.println("Its a odd number");
        }

        sc.close();
    }
}
