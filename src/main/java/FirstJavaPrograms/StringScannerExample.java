package FirstJavaPrograms;

import java.util.Scanner;

public class StringScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next(); // take single word as an input
        System.out.println("Good Morning " + name );


    }
}
