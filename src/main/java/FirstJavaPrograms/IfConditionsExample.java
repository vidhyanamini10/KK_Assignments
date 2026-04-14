package FirstJavaPrograms;

import java.util.Scanner;

public class IfConditionsExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter operator: ");
        String operator = input.next();

        if(operator.equals("+")){
            System.out.println("Addition of 2 numbers: "+ (num1 + num2));
        }else if(operator.equals("-")){
            System.out.println("Subtraction of 2 numbers: "+ (num1 - num2));
        }else if(operator.equals("*")){
            System.out.println("Multiplication of 2 numbers: "+ (num1 * num2));
        }else if(operator.equals("/")){
            System.out.println("Division of 2 numbers: "+ (num1 / num2));
        }else {
            System.out.println("Invalid operator");
        }

        input.close();

    }
}
