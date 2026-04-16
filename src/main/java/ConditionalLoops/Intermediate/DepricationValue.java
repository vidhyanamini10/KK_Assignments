package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class DepricationValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of asset:  ");
        double cost = sc.nextDouble();
        System.out.print("Enter the salvage value for useful life :  ");
        double salValue = sc.nextDouble();
        System.out.println("Enter the years ");
        int years = sc.nextInt();

        double depricationValue = (cost-salValue)/years;



        System.out.println("Depreciation of Value is " + depricationValue );
    }
}
