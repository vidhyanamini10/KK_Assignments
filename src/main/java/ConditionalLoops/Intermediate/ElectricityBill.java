package ConditionalLoops.Intermediate;


import java.util.Scanner;

/**
 * first 100 units - 10/unit
 * second 100 units - 15/unit
 * third 100 units - 20/unit
 * above 300 - 25/unit
 */
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units to get your electricity bill ");
        int num = sc.nextInt();
        int bill = 0;
        if(num <=100){
            bill = num * 10;
        }else if(num <= 200){
            bill = (100 * 10) + (num - 100) * 15;
        }else if(num <= 300){
            bill = (100 * 10) + (100 * 15) + (num -200) * 20;
        }else {
            bill = (100 * 10) + (100 * 15) + (100 * 20) + (num -300) * 25;
        }

        System.out.println("Electricy bill for " + num + "   is  " + bill);


        sc.close();
    }
}
