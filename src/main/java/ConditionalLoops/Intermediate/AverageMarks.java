package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks to calculate average and press X to exist ");
        int count =0;
        double average = 0.0;
        while(true){
            String marks = sc.next();
            if(marks.equalsIgnoreCase("X")) break;
            count++;
            int num = Integer.parseInt(marks);
            average = (double) num/count;
        }
        System.out.println("The average marks is " + average);
        sc.close();
    }
}
