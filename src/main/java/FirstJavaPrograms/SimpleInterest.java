package FirstJavaPrograms;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter principle : ");
        double principle = input.nextDouble();

        System.out.println("Enter rate : ");
        double rate = input.nextDouble();

        System.out.println("Enter time: ");
        double time = input.nextDouble();

        double interest = (principle * rate * time)/ 100;

        System.out.println("The interest is: " + interest);

        input.close();
    }
}
